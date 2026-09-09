package com.example.proyectoalmacenamiento.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.proyectoalmacenamiento.model.UsuarioModel

@Dao
interface UsuarioDAO {

    @Query("SELECT * FROM tabla_usuario")
    suspend fun getAll(): List<UsuarioModel>
    @Query("SELECT * FROM tabla_usuario WHERE id = :id")
    suspend fun getById(id: Int): UsuarioModel

    @Insert
    suspend fun insert(usuario: UsuarioModel)

    @Update
    suspend fun update(usuario: UsuarioModel)

    @Delete
    suspend fun delete(usuario: UsuarioModel)

}