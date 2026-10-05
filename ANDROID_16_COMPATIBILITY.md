# BlackBox Android 16 Runtime Update

## Root cause fixed

The previous build only migrated the Gradle/SDK toolchain. It retained the old Pine ART hook engine, which was not ported beyond the Android 11-era ART implementation. On Android 16 this caused every virtual process to fail before the guest application's `Application.onCreate()`, producing the loading loop or return to the BlackBox lobby.

## Runtime migration

This update removes the old Pine-based runtime and ports the maintained BlackBox runtime architecture:

- Dobby native inline hooks for the arm64-v8a and armeabi-v7a builds;
- JniHook ART/JNI method registration backend with runtime-derived ArtMethod offsets;
- Android 16-safe native initialization and hidden-API handling;
- safer process/application bootstrap and fallback handling;
- Android 15/16 service compatibility guards and crash prevention;
- flexible page-size native build flags.

The old `Bcore/pine-core`, `Bcore/pine-xposed`, and `Bcore/pine-xposed-res` modules are no longer part of the runtime.

## Build verification

The following completed successfully in the sandbox:

```text
./gradlew :Bcore:assembleDebug
./gradlew :app:assembleDebug
```

Build settings:

- compile SDK: 35
- minimum SDK: 21
- native ABIs: arm64-v8a and armeabi-v7a
- NDK: 29.0.13846066
- flexible page-size native build enabled

## Android 16 status

This release is an **Android 16 arm64 preview**. The runtime backend now uses the maintained Pine-free Dobby/JniHook implementation rather than the unsupported Pine engine. The APK was build-verified, but physical-device validation on the user's Infinix GT 30 Pro still requires installing this new APK and launching a test guest app.

If a guest app still fails, collect the BlackBox crash/log output from the new build before changing permissions or reinstalling guest APKs; the failure will then be in a specific compatibility layer rather than the old universal Pine initialization failure.

## Release artifact

Use the `arm64-v8a` APK for modern 64-bit phones. The universal APK contains both supported ABIs but is larger.
