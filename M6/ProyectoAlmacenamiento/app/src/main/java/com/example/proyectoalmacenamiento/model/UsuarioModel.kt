package com.example.proyectoalmacenamiento.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_usuario")
data class UsuarioModel (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val apellido: String,
    val email: String,
    val celular: String,
    val sucursal: String
)