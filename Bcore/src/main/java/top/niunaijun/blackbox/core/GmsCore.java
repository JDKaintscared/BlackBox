package top.niunaijun.blackbox.core;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import top.niunaijun.blackbox.BlackBoxCore;
import top.niunaijun.blackbox.entity.pm.InstallResult;

public class GmsCore {
    private static final String TAG = "GmsCore";
    private static final LinkedHashSet<String> GOOGLE_APP = new LinkedHashSet<>();
    private static final LinkedHashSet<String> GOOGLE_SERVICE = new LinkedHashSet<>();
    public static final String GMS_PKG = "com.google.android.gms";
    public static final String GSF_PKG = "com.google.android.gsf";
    public static final String VENDING_PKG = "com.android.vending";

    static {
        GOOGLE_SERVICE.add(GMS_PKG);
        GOOGLE_SERVICE.add(GSF_PKG);
        GOOGLE_SERVICE.add("com.google.android.gsf.login");
        GOOGLE_SERVICE.add("com.google.android.backuptransport");
        GOOGLE_SERVICE.add("com.google.android.backup");
        GOOGLE_SERVICE.add("com.google.android.configupdater");
        GOOGLE_SERVICE.add("com.google.android.syncadapters.contacts");
        GOOGLE_SERVICE.add("com.google.android.feedback");
        GOOGLE_SERVICE.add("com.google.android.onetimeinitializer");
        GOOGLE_SERVICE.add("com.google.android.partnersetup");
        GOOGLE_SERVICE.add("com.google.android.setupwizard");
        GOOGLE_SERVICE.add("com.google.android.syncadapters.calendar");
        GOOGLE_APP.add(VENDING_PKG);
        GOOGLE_APP.add("com.google.android.play.games");
    }

    public static boolean isGoogleService(String packageName) { return GOOGLE_SERVICE.contains(packageName); }
    public static boolean isGoogleAppOrService(String packageName) { return GOOGLE_APP.contains(packageName) || GOOGLE_SERVICE.contains(packageName); }

    private static InstallResult installPackages(Set<String> packages, int userId) {
        BlackBoxCore core = BlackBoxCore.get();
        PackageManager pm = BlackBoxCore.getContext().getPackageManager();
        for (String packageName : packages) {
            if (core.isInstalled(packageName, userId)) continue;
            try {
                ApplicationInfo info = pm.getApplicationInfo(packageName, 0);
                InstallResult result = core.installPackageAsUser(info.sourceDir, userId);
                if (result == null || !result.success) return result == null ? new InstallResult().installError("No installer result for " + packageName) : result;
            } catch (PackageManager.NameNotFoundException ignored) { }
        }
        return new InstallResult();
    }

    private static InstallResult installCachedBundle(File directory, int userId) {
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".apk"));
        if (files == null || files.length == 0) return new InstallResult().installError("Verified GMS bundle has no APK files");
        List<File> baseApks = new ArrayList<>();
        PackageManager pm = BlackBoxCore.getContext().getPackageManager();
        for (File file : files) {
            try {
                android.content.pm.PackageInfo info = pm.getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (info == null || info.applicationInfo == null) continue;
                if (info.splitNames != null && info.splitNames.length > 0) continue;
                String pkg = info.packageName;
                if (isGoogleAppOrService(pkg)) baseApks.add(file);
            } catch (Throwable ignored) { }
        }
        baseApks.sort(Comparator.comparingInt(file -> {
            try {
                android.content.pm.PackageInfo info = pm.getPackageArchiveInfo(file.getAbsolutePath(), 0);
                if (info == null) return 99;
                if (GSF_PKG.equals(info.packageName)) return 0;
                if (GMS_PKG.equals(info.packageName)) return 1;
                if (VENDING_PKG.equals(info.packageName)) return 2;
            } catch (Throwable ignored) { }
            return 10;
        }));
        for (File file : baseApks) {
            InstallResult result = coreInstall(file, userId);
            if (result == null || !result.success) return result == null ? new InstallResult().installError("GMS APK installation returned no result") : result;
        }
        return new InstallResult();
    }

    private static InstallResult coreInstall(File file, int userId) {
        Log.i(TAG, "Installing cached GMS APK: " + file.getName());
        return BlackBoxCore.get().installPackageAsUser(file, userId);
    }

    public static InstallResult installGApps(int userId) {
        File cached = new File(BlackBoxCore.getContext().getFilesDir(), "gms-bundle");
        if (new File(cached, ".verified").exists()) {
            InstallResult cachedResult = installCachedBundle(cached, userId);
            if (cachedResult.success) return cachedResult;
            Log.w(TAG, "Cached GMS bundle failed: " + cachedResult.msg);
        }
        LinkedHashSet<String> packages = new LinkedHashSet<>();
        packages.addAll(GOOGLE_SERVICE);
        packages.addAll(GOOGLE_APP);
        return installPackages(packages, userId);
    }

    public static void uninstallGApps(int userId) {
        for (String pkg : GOOGLE_SERVICE) BlackBoxCore.get().uninstallPackageAsUser(pkg, userId);
        for (String pkg : GOOGLE_APP) BlackBoxCore.get().uninstallPackageAsUser(pkg, userId);
    }
    public static void remove(String packageName) { GOOGLE_SERVICE.remove(packageName); GOOGLE_APP.remove(packageName); }
    public static boolean isSupportGms() {
        try { BlackBoxCore.getContext().getPackageManager().getPackageInfo(GMS_PKG, 0); return true; }
        catch (PackageManager.NameNotFoundException ignored) { return false; }
    }
    public static boolean isInstalledGoogleService(int userId) { return BlackBoxCore.get().isInstalled(GMS_PKG, userId); }
}
