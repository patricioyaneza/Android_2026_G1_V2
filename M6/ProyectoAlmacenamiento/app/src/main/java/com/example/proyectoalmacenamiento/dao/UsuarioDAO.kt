package com.example.proyectoalmacenamiento.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.proyectoalmacenamiento.model.Usuario

@Dao
interface UsuarioDAO {

    @Query("SELECT * FROM usuario")
    fun getAll(): List<Usuario>
    @Query("SELECT * FROM usuario WHERE id = :id")
    fun getById(id: Int): Usuario

    @Insert
    fun insert(usuario: Usuario)

    @Update
    fun update(usuario: Usuario)

    @Delete
    fun delete(usuario: Usuario)

}