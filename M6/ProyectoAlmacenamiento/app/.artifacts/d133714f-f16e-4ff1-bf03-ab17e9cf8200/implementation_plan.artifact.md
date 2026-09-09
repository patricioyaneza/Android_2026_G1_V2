# Fix Room Database Main Thread Access Error

The application is crashing with a `java.lang.IllegalStateException: Cannot access database on the main thread`. This occurs because Room database operations are being performed on the main (UI) thread, which is prohibited by Room to prevent UI freezes.

## User Review Required

> [!IMPORTANT]
> I will be making the DAO methods `suspend` functions. This requires Kotlin Coroutines, which seem to be already present in the project as `lifecycleScope.launch` is used in `GuardarSQLiteActivity.kt`.

## Proposed Changes

### Data Layer

#### [MODIFY] [UsuarioDAO.kt](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/app/src/main/java/com/example/proyectoalmacenamiento/dao/UsuarioDAO.kt)
- Mark all database access methods (`getAll`, `getById`, `insert`, `update`, `delete`) as `suspend`. This allows Room to handle the off-thread execution automatically when called from a coroutine.

### UI Layer

#### [MODIFY] [GuardarSQLiteActivity.kt](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/app/src/main/java/com/example/proyectoalmacenamiento/GuardarSQLiteActivity.kt)
- The code already uses `lifecycleScope.launch` to call `usuarioDAO.insert(usuario)`. By making `insert` a `suspend` function, the call will correctly wait for completion without blocking the main thread.
- I will move the `Toast` and input clearing (if any) inside the coroutine or ensure they happen after the insertion if desired, though currently the requirement is just to fix the crash.

## Verification Plan

### Automated Tests
- I will attempt to build the project using `./gradlew assembleDebug` to ensure no compilation errors were introduced by the change to `suspend` functions.

### Manual Verification
- Deploy the app to a device/emulator.
- Navigate to the "Guardar SQLite" screen.
- Fill in the user details and click "Guardar".
- Verify that the app no longer crashes and the "Usuario guardado correctamente" toast appears.
