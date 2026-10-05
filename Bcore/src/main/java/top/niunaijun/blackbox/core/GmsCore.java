package top.niunaijun.blackbox.core;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import java.util.LinkedHashSet;
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
        GOOGLE_APP.add(VENDING_PKG);
        GOOGLE_APP.add("com.google.android.play.games");
        GOOGLE_APP.add("com.google.android.wearable.app");
        GOOGLE_APP.add("com.google.android.wearable.app.cn");

        // GMS and GSF are inserted first because Play Store depends on them.
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
    }

    public static boolean isGoogleService(String packageName) {
        return GOOGLE_SERVICE.contains(packageName);
    }

    public static boolean isGoogleAppOrService(String packageName) {
        return GOOGLE_APP.contains(packageName) || GOOGLE_SERVICE.contains(packageName);
    }

    private static InstallResult installPackages(Set<String> packages, int userId) {
        BlackBoxCore blackBoxCore = BlackBoxCore.get();
        PackageManager hostPackageManager = BlackBoxCore.getContext().getPackageManager();

        for (String packageName : packages) {
            if (blackBoxCore.isInstalled(packageName, userId)) {
                continue;
            }

            final ApplicationInfo applicationInfo;
            try {
                applicationInfo = hostPackageManager.getApplicationInfo(packageName, 0);
            } catch (PackageManager.NameNotFoundException ignored) {
                // Optional Google components vary by device image; skip absent ones.
                continue;
            }

            String sourceApk = applicationInfo.sourceDir;
            if (sourceApk == null || sourceApk.isEmpty()) {
                return new InstallResult().installError(
                        "Google package has no installable APK path: " + packageName);
            }

            // The virtual installer accepts an APK/archive path, not a package name.
            InstallResult result = blackBoxCore.installPackageAsUser(sourceApk, userId);
            if (result == null || !result.success) {
                String message = result == null ? "installer returned no result" : result.msg;
                Log.e(TAG, "Failed installing " + packageName + " from " + sourceApk + ": " + message);
                return result == null
                        ? new InstallResult().installError(
                                "Failed installing " + packageName + ": " + message)
                        : result;
            }
        }
        return new InstallResult();
    }

    private static void uninstallPackages(Set<String> packages, int userId) {
        BlackBoxCore blackBoxCore = BlackBoxCore.get();
        for (String packageName : packages) {
            blackBoxCore.uninstallPackageAsUser(packageName, userId);
        }
    }

    public static InstallResult installGApps(int userId) {
        LinkedHashSet<String> googlePackages = new LinkedHashSet<>();
        googlePackages.addAll(GOOGLE_SERVICE);
        googlePackages.addAll(GOOGLE_APP);

        InstallResult result = installPackages(googlePackages, userId);
        if (result == null || !result.success) {
            uninstallGApps(userId);
            return result == null
                    ? new InstallResult().installError("Google services installer returned no result")
                    : result;
        }
        return result;
    }

    public static void uninstallGApps(int userId) {
        uninstallPackages(GOOGLE_SERVICE, userId);
        uninstallPackages(GOOGLE_APP, userId);
    }

    public static void remove(String packageName) {
        GOOGLE_SERVICE.remove(packageName);
        GOOGLE_APP.remove(packageName);
    }

    public static boolean isSupportGms() {
        try {
            BlackBoxCore.getContext().getPackageManager().getPackageInfo(GMS_PKG, 0);
            return true;
        } catch (PackageManager.NameNotFoundException ignored) {
            return false;
        }
    }

    public static boolean isInstalledGoogleService(int userId) {
        return BlackBoxCore.get().isInstalled(GMS_PKG, userId);
    }
}
