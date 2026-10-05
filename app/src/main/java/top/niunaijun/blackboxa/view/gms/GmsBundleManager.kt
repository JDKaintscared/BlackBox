package top.niunaijun.blackboxa.view.gms

import android.content.Context
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.security.MessageDigest
import java.util.zip.ZipFile

object GmsBundleManager {
    const val DOWNLOAD_URL = "https://github.com/JDKaintscared/BlackBox/releases/download/gms-bundle-infinix-gt30pro-android16/apks.zip"
    private const val SHA256 = "04786d5fc61f9d83391b833b56b9d9badb3b5c518d01010edd12f7ddadb72ce8"

    fun bundleDirectory(context: Context): File = File(context.filesDir, "gms-bundle")

    fun downloadAndExtract(context: Context) {
        val root = bundleDirectory(context)
        val archive = File(context.cacheDir, "gms-bundle.zip.part")
        val complete = File(context.cacheDir, "gms-bundle.zip")
        root.deleteRecursively()
        archive.delete()
        complete.delete()
        val connection = (URL(DOWNLOAD_URL).openConnection() as HttpURLConnection).apply {
            connectTimeout = 20_000
            readTimeout = 60_000
            requestMethod = "GET"
        }
        try {
            connection.connect()
            if (connection.responseCode !in 200..299) throw IllegalStateException("Download failed: HTTP ${connection.responseCode}")
            connection.inputStream.use { input -> FileOutputStream(archive).use { output -> input.copyTo(output) } }
            if (sha256(archive) != SHA256) throw IllegalStateException("GMS bundle checksum mismatch")
            if (!archive.renameTo(complete)) throw IllegalStateException("Could not prepare GMS bundle")
            root.mkdirs()
            ZipFile(complete).use { outer ->
                outer.entries().asSequence().forEach { entry ->
                    if (entry.isDirectory) return@forEach
                    val name = entry.name.substringAfterLast('/')
                    if (name.isBlank() || name.contains("..")) return@forEach
                    val lower = name.lowercase()
                    if (!lower.endsWith(".apk") && !lower.endsWith(".apks")) return@forEach
                    val destination = File(root, name)
                    outer.getInputStream(entry).use { input -> FileOutputStream(destination).use { output -> input.copyTo(output) } }
                    if (lower.endsWith(".apks")) extractApks(destination, root)
                }
            }
            root.listFiles()?.filter { it.extension.equals("apks", true) }?.forEach { it.delete() }
            File(root, ".verified").writeText(SHA256)
        } finally {
            connection.disconnect()
            archive.delete()
            complete.delete()
        }
    }

    private fun extractApks(bundle: File, root: File) {
        ZipFile(bundle).use { zip ->
            zip.entries().asSequence().forEach { entry ->
                if (entry.isDirectory) return@forEach
                val name = entry.name.substringAfterLast('/')
                if (!name.endsWith(".apk", true) || name.contains("..")) return@forEach
                val destination = File(root, "${bundle.nameWithoutExtension}-$name")
                zip.getInputStream(entry).use { input -> FileOutputStream(destination).use { output -> input.copyTo(output) } }
            }
        }
    }

    private fun sha256(file: File): String {
        val digest = MessageDigest.getInstance("SHA-256")
        FileInputStream(file).use { input ->
            val buffer = ByteArray(64 * 1024)
            var count: Int
            while (input.read(buffer).also { count = it } >= 0) if (count > 0) digest.update(buffer, 0, count)
        }
        return digest.digest().joinToString("") { "%02x".format(it) }
    }
}
