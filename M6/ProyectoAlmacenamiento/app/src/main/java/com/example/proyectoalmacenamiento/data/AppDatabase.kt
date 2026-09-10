package com.example.proyectoalmacenamiento.data


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.proyectoalmacenamiento.dao.UsuarioDAO
import com.example.proyectoalmacenamiento.model.UsuarioModel

@Database(entities = [UsuarioModel::class], version = 2)
abstract class AppDatabase: RoomDatabase() {
    abstract fun usuarioDao(): UsuarioDAO
    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "basededatos"
                )
                  //  .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}