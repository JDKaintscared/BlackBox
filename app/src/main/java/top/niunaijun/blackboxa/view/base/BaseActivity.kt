package top.niunaijun.blackboxa.view.base

import android.os.Build
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        applyRefreshRatePreference()
    }

    private fun applyRefreshRatePreference() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) return
        val mode = getSharedPreferences("AppSharedPreferenceDelegate", MODE_PRIVATE)
                .getString("uiRefreshRate", "device") ?: "device"
        val preferred = when (mode) {
            "60" -> 60f
            "90" -> 90f
            "120" -> 120f
            else -> 0f // Let Android choose the display's current optimal rate.
        }
        window.attributes = window.attributes.apply {
            preferredRefreshRate = preferred
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(true)
        }
    }

    protected fun initToolbar(toolbar: Toolbar,title:Int, showBack: Boolean = false, onBack: (() -> Unit)? = null) {
        setSupportActionBar(toolbar)
        toolbar.setTitle(title)
        if (showBack) {
            supportActionBar?.let {
                it.setDisplayHomeAsUpEnabled(true)
                toolbar.setNavigationOnClickListener {
                    if (onBack != null) {
                        onBack()
                    }
                    finish()
                }
            }
        }
    }

    protected fun currentUserID():Int{
        return intent.getIntExtra("userID", 0)
    }
}