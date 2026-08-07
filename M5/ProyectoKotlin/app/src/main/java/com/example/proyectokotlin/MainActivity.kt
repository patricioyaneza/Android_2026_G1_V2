package com.example.proyectokotlin

import android.os.Bundle
import android.util.Log
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

    var contador = 0


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
        System.out.println("Hola mundo")
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
        Log.d("Ciclo de Vida", "Llamada al metodo onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de Vida", "Llamada al metodo onStart")
        contador++ // contador = contador + 1

    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de Vida", "Llamada al metodo onResume")
        contador++
        Log.d("Ciclo de Vida", "Contador: " + contador)
    }
    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de Vida", "Llamada al metodo onPause")
        contador++
    }
    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de Vida", "Llamada al metodo onStop")
        contador++
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de Vida", "Llamada al metodo onRestart")
        contador++
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de Vida", "Llamada al metodo onDestroy")
        Log.d("Ciclo de Vida", "Contador: " + contador)
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