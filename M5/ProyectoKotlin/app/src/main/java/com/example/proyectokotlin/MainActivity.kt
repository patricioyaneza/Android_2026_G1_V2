package com.example.proyectokotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectokotlin.ui.theme.ProyectoKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        println("Hola mundo")
        val persona = Persona(12345678, "Juan", "Pérez", 30)

        println(persona)
        println("NOMBRE: " + persona.nombre)
        persona.nombre = "Pedro"
        println("NOMBRE: " + persona.nombre)

        val vehiculo = Vehiculo("ABC123", "Toyota", 2020, "Rojo")
        println(vehiculo)
        println("MARCA: " + vehiculo.marca)
        vehiculo.marca = "Ford"
        println("MARCA: " + vehiculo.marca)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProyectoKotlinTheme {
        Greeting("Android")
    }
}