package com.example.proyectokotlin

class Persona(var rut: Int, var nombre: String?, var apellido: String?, var edad: Int) {
    override fun toString(): String {
        return "Persona [rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]"
    }
}
