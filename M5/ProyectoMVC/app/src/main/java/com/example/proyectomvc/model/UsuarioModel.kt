package com.example.proyectomvc.model

class UsuarioModel {
    var rut: String = ""
    var nombre: String = ""
    var correo: String = ""
    var edad: Int = 0


    fun guardar(rut: String, nombre: String, correo: String, edad: Int): Boolean {
        if(rut.isEmpty() || nombre.isEmpty() || correo.isEmpty() || edad < 12)
            return false // no guarda

        this.rut = rut
        this.nombre = nombre
        this.correo = correo
        this.edad = edad
        return true // guarda
    }

    fun imprimir(): String {
        return "Rut: $rut Nombre: $nombre Correo: $correo Edad: $edad"
    }

}