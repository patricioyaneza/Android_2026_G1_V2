package com.example.proyectoapirest

class Calculadora {

    fun sumar(a: Int, b: Int): Int {
        return a + b
    }
    /*
Agregar en la clase Calculadora un método para restar, dividir y multimplicar los números.
Aplicar 4 pruebas a cada metodo
*/
    fun restar(a: Int, b: Int): Int {
        return a - b
    }
    fun dividir(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return a / b
    }
    fun multiplicar(a: Int, b: Int): Int {
        return a * b
    }

}