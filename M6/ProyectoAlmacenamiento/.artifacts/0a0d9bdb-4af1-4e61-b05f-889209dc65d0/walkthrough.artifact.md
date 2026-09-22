# Walkthrough - Fixed Room KSP unexpected jvm signature Error

I have successfully resolved the `[ksp] java.lang.IllegalStateException: unexpected jvm signature V` build error by upgrading the Room persistence library to a version fully compatible with Kotlin 2.2.10 and KSP.

## Changes Made

### Build Configuration

#### [libs.versions.toml](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/gradle/libs.versions.toml)
- Added `room = "2.8.4"` to the `[versions]` section.
- Added Room dependency catalog entries (`androidx-room-runtime`, `androidx-room-compiler`, `androidx-room-ktx`).

#### [app/build.gradle.kts](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/app/build.gradle.kts)
- Configured Room dependencies to be managed via the Gradle version catalog (`libs.androidx.room...`).

## Verification Results

### Automated Tests & Compilations
- Ran `:app:kspDebugKotlin` which successfully processed the Room annotations without any signature mismatch issues.
- Gradle synchronization and compilation passed successfully.
