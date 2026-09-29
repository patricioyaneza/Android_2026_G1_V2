package com.example.proyectoapirest

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class CalculadoraTest {
    private var calculadora: Calculadora? = null

    @Before
    fun setUp() {
        calculadora = Calculadora()
        println("Setup ejecutado")
    }

    @After
    fun tearDown() {
        calculadora = null
        println("Teardown ejecutado")
    }

    @Test
    fun sumar_dosNumerosPositivos() {
        println(" sumar_dosNumerosPositivos ejecutado")

        val resultado = calculadora?.sumar(2, 3)
        assertEquals(5, resultado)
    }

    @Test
    fun sumar_dosNumerosNegativos() {
        val resultado = calculadora?.sumar(-2, -3)
        assertEquals(-5, resultado,)
        println("Resultado: " + resultado)
    }
    @Test
    fun sumar_unNumeroPositivoYUnNegativo() {
        val resultado = calculadora?.sumar(2, -3)
        assertEquals(-1, resultado)
        val nombreMetodo = object {}.javaClass.enclosingMethod?.name
        println("Test: $nombreMetodo ejecutado")
    }
    @Test
    fun sumar_dosNumerosCero() {
        val resultado = calculadora?.sumar(0, 0)
        assertEquals(0, resultado)
    }
    @Test
    fun sumar_unNumeroPositivoYUnCero() {
        val resultado = calculadora?.sumar(2, 0)
        assertEquals(2, resultado)
    }
    @Test
    fun sumar_unNumeroNegativoYUnCero() {
        val resultado = calculadora?.sumar(-2, 0)
        assertEquals(-2, resultado)
    }
    @Test
    fun sumar_dosNumerosMaximos() {
        val resultado = calculadora?.sumar(Int.MAX_VALUE, Int.MAX_VALUE)
        assertEquals(Int.MAX_VALUE + Int.MAX_VALUE, resultado)
    }
    @Test
    fun sumar_dosNumerosMinimos() {
        val resultado = calculadora?.sumar(Int.MIN_VALUE, Int.MIN_VALUE)
        assertEquals(Int.MIN_VALUE + Int.MIN_VALUE, resultado)
    }

    @Test
    fun dividir_dosNumerosPositivos() {
        val resultado = calculadora?.dividir(6, 3)
        assertEquals(2, resultado)
    }
    @Test
    fun dividir_unNumeroPositivoYUnNegativo() {
        val resultado = calculadora?.dividir(6, -3)
        assertEquals(-2, resultado)
    }
    @Test
    fun dividir_dosNumerosNegativos() {
        val resultado = calculadora?.dividir(-6, -3)
        assertEquals(2, resultado)
    }

    @Test
    fun dividir_unNumeroPositivoYUnCero() {
        try {
            calculadora?.dividir(6, 0)
        } catch (e: IllegalArgumentException) {
            assertEquals("No se puede dividir por cero", e.message)
        }
        val nombreMetodo = object {}.javaClass.enclosingMethod?.name
        println("Test: $nombreMetodo ejecutado")
    }
}
