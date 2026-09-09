# Fix for Room Schema Integrity Error

I have fixed the `IllegalStateException` caused by a mismatch between the Room database schema in the code and the one persisted on the device.

## Changes Made

### [AppDatabase.kt](file:///C:/zPersonal/Android Trainee TD/Android_2026_G1_V2/M6/ProyectoAlmacenamiento/app/src/main/java/com/example/proyectoalmacenamiento/data/AppDatabase.kt)

- Increased the database version from `1` to `2`.
- Added `.fallbackToDestructiveMigration()` to the database builder.

```diff
-@Database(entities = [UsuarioModel::class], version = 1)
+@Database(entities = [UsuarioModel::class], version = 2)
 abstract class AppDatabase: RoomDatabase() {
     ...
     fun getDatabase(context: Context): AppDatabase {
         return INSTANCE ?: synchronized(this) {
             val instance = Room.databaseBuilder(
                 context.applicationContext,
                 AppDatabase::class.java,
                 "basededatos"
             )
+                .fallbackToDestructiveMigration()
                 .build()
             INSTANCE = instance
             instance
         }
     }
 }
```

> [!NOTE]
> `fallbackToDestructiveMigration()` allows Room to recreate the database when the schema changes without needing a migration script. **This will clear all existing data** in the database. If you need to preserve data, you should implement a proper `Migration` object.

## Verification

- Successfully built the project using `./gradlew :app:assembleDebug`.
- Verified that the database configuration now allows for schema updates.
