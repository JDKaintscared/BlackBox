# BlackBox Android 16 Compatibility Update

## What changed in this fork

- Migrated the build to **Android Gradle Plugin 8.9.1**, Gradle 8.11.1, JDK 21, compile SDK **API 36**, and NDK 28.
- Added explicit AGP 8 namespace/build configuration and enabled AIDL generation where the mirror module still needs it.
- Replaced abandoned Maven/JitPack UI dependencies with vendored source/local AARs under `third_party/` and `app/libs/`.
- Vendored FreeReflection source so dependency resolution does not rely on the unavailable `me.weishu:free_reflection:3.0.1` artifact.
- Generated and checked in Bcore IPC Java sources using the legacy-compatible AIDL compiler; this avoids the AGP 8 cross-module AIDL ordering failure.
- Restricted the published build to **arm64-v8a**, matching the requested 64-bit virtual-space target.
- Updated Kotlin/AndroidX signatures and native C++ headers required by current JDK/Kotlin/NDK toolchains.

## Build verification

The following command completes successfully in the repository:

```bash
./gradlew :app:assembleBlackBox64Debug --no-daemon
```

The resulting artifact is an **unsigned debug APK**. It is suitable for installation with developer/test settings enabled, but it is not a production-signed release.

## Important compatibility boundary

This is a **toolchain and build-compatibility update**, not a claim that every BlackBox virtualized app works on every Android 15/16 device. The original engine relies on hidden Android framework interfaces, native ART/Pine hooks, and a deliberately low target SDK (28). Android 16 can still restrict or change those internals by device/ROM. Runtime compatibility must be validated on physical API 35/API 36 arm64 devices with representative apps.

A production Android 16 release still needs device testing for:

- app install/launch and process restart;
- storage, notifications, foreground services, camera/microphone and location;
- Google Play services-dependent apps;
- Xposed/module loading;
- 16 KB page-size devices and OEM ROMs;
- background execution, package visibility, and permission prompts.

## Research sources

- [Android 16 behavior changes](https://developer.android.com/about/versions/16/behavior-changes-all)
- [Android 16 behavior changes for apps targeting API 36](https://developer.android.com/about/versions/16/behavior-changes-16)
- [Set up the Android 16 SDK](https://developer.android.com/about/versions/16/setup-sdk)
- [Android 16 KB page-size guidance](https://developer.android.com/guide/practices/page-sizes)
- [Non-SDK interface restrictions](https://developer.android.com/guide/app-compatibility/restrictions-non-sdk-interfaces)
- [FreeReflection source](https://github.com/tiann/FreeReflection)
- [Upstream BlackBox project](https://github.com/FBlackBox/BlackBox)
