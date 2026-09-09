# Implementation Plan - Fix Room KSP "unexpected jvm signature V" Error

The project is experiencing a build failure with the error `[ksp] java.lang.IllegalStateException: unexpected jvm signature V`. This is a known issue when using Room version 2.6.x with KSP2 (enabled by default in Kotlin 2.0+). The error occurs because Room 2.6.x's KSP processor does not correctly handle `suspend` functions that return `Unit` (represented as `V` in JVM signatures) when running under KSP2.

## Proposed Changes

### Build Configuration

#### [MODIFY] [gradle.properties](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/gradle.properties)
- Add `ksp.useKSP2=false` to fall back to the original KSP implementation, which is compatible with Room 2.6.1.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:kspDebugKotlin` to verify that the KSP processing completes successfully.
- Run `./gradlew assembleDebug` to ensure the full build succeeds.

### Manual Verification
- Verify that the app still builds and runs, and that Room database operations (Insert, Update, Delete) continue to function as expected.
