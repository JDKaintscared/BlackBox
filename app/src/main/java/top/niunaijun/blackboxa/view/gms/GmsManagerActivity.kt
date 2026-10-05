package top.niunaijun.blackboxa.view.gms

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.widget.Toolbar
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import cbfg.rvadapter.RVAdapter
import com.afollestad.materialdialogs.MaterialDialog
import top.niunaijun.blackboxa.R
import top.niunaijun.blackboxa.bean.GmsBean
import top.niunaijun.blackboxa.databinding.ActivityGmsBinding
import top.niunaijun.blackboxa.util.InjectionUtil
import top.niunaijun.blackboxa.util.inflate
import top.niunaijun.blackboxa.util.toast
import top.niunaijun.blackboxa.view.base.LoadingActivity

class GmsManagerActivity : LoadingActivity() {
    private lateinit var viewModel: GmsViewModel
    private lateinit var mAdapter: RVAdapter<GmsBean>
    private val viewBinding: ActivityGmsBinding by inflate()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        initToolbar(viewBinding.toolbarLayout.toolbar, R.string.gms_manager, true)
        addBundleDownloadButton()
        initViewModel()
        initRecyclerView()
    }

    private fun addBundleDownloadButton() {
        val button = Button(this).apply {
            text = "Download GMS"
            textSize = 12f
            setTextColor(Color.WHITE)
            setOnClickListener { downloadBundle() }
        }
        viewBinding.toolbarLayout.toolbar.addView(button, Toolbar.LayoutParams(
            Toolbar.LayoutParams.WRAP_CONTENT,
            Toolbar.LayoutParams.MATCH_PARENT,
            Gravity.END
        ))
    }

    private fun downloadBundle() {
        MaterialDialog(this).show {
            title(text = "Download GMS bundle")
            message(text = "Downloads the verified Google bundle for Infinix GT 30 Pro Android 16. No root access is required.")
            positiveButton(text = "Download") {
                showLoading()
                Thread {
                    try {
                        GmsBundleManager.downloadAndExtract(this@GmsManagerActivity)
                        runOnUiThread {
                            hideLoading()
                            toast("GMS bundle ready. Turn on a user to install it.")
                        }
                    } catch (error: Throwable) {
                        runOnUiThread {
                            hideLoading()
                            MaterialDialog(this@GmsManagerActivity).show {
                                title(R.string.gms_manager)
                                message(text = "GMS download failed: ${error.message ?: "unknown error"}")
                                positiveButton(R.string.done)
                            }
                        }
                    }
                }.start()
            }
            negativeButton(R.string.cancel)
        }
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this, InjectionUtil.getGmsFactory())[GmsViewModel::class.java]
        showLoading()
        viewModel.mInstalledLiveData.observe(this) {
            hideLoading()
            mAdapter.setItems(it)
        }
        viewModel.mUpdateInstalledLiveData.observe(this) { result ->
            if (result == null) return@observe
            val items = mAdapter.getItems()
            for (index in items.indices) {
                val bean = items[index]
                if (bean.userID == result.userID) {
                    if (result.success) bean.isInstalledGms = !bean.isInstalledGms
                    mAdapter.replaceAt(index, bean)
                    break
                }
            }
            hideLoading()
            if (result.success) toast(result.msg) else MaterialDialog(this).show {
                title(R.string.gms_manager)
                message(text = result.msg)
                positiveButton(R.string.done)
            }
        }
        viewModel.getInstalledUser()
    }

    private fun initRecyclerView() {
        mAdapter = RVAdapter<GmsBean>(this, GmsAdapter()).bind(viewBinding.recyclerView)
            .setItemClickListener { view, item, _ ->
                val checkbox = view.findViewById<Switch>(R.id.checkbox)
                if (item.isInstalledGms) uninstallGms(item.userID, checkbox)
                else installGms(item.userID, checkbox)
            }
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun installGms(userID: Int, checkbox: Switch) {
        MaterialDialog(this).show {
            title(R.string.enable_gms)
            message(R.string.enable_gms_hint)
            positiveButton(R.string.done) { showLoading(); viewModel.installGms(userID) }
            negativeButton(R.string.cancel) { checkbox.isChecked = !checkbox.isChecked }
        }
    }

    private fun uninstallGms(userID: Int, checkbox: Switch) {
        MaterialDialog(this).show {
            title(R.string.disable_gms)
            message(R.string.disable_gms_hint)
            positiveButton(R.string.done) { showLoading(); viewModel.uninstallGms(userID) }
            negativeButton(R.string.cancel) { checkbox.isChecked = !checkbox.isChecked }
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, GmsManagerActivity::class.java))
        }
    }
}
