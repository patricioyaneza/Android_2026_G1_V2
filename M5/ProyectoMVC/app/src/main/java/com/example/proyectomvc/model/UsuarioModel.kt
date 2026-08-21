package com.example.proyectomvc.model

class UsuarioModel {
    var rut: String = ""
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0

    fun imprimirDatos(): String {
        return "Rut: $rut Nombre: $nombre Correo: $correo Edad: $edad"
    }

}