# Implementation Plan - Fix Room KSP "unexpected jvm signature V" Error

The project is experiencing a build error `[ksp] java.lang.IllegalStateException: unexpected jvm signature V` during the KSP processing of Room DAOs. This is a known compatibility issue between Room 2.6.x and newer Kotlin (2.2.x)/KSP versions, specifically when handling `suspend` functions that return `Unit`.

## User Review Required

> [!IMPORTANT]
> I am proposing to upgrade the Room library from version **2.6.1** to **2.8.4**. This upgrade is necessary for compatibility with the project's Kotlin (2.2.10) and KSP versions.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/gradle/libs.versions.toml)
- Add Room version `2.8.4`.
- Add Room library definitions (`room-runtime`, `room-compiler`, `room-ktx`).

#### [MODIFY] [app/build.gradle.kts](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/app/build.gradle.kts)
- Remove hardcoded Room version and dependencies.
- Use Room dependencies from `libs.versions.toml` using the `libs` alias.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:kspDebugKotlin` to verify that the KSP processing error is resolved.
- Run `./gradlew assembleDebug` to ensure the project builds successfully.

### Manual Verification
- N/A (Build fix)
