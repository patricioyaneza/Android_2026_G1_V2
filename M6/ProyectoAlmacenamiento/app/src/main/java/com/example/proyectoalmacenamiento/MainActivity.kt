package com.example.proyectoalmacenamiento

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
import com.example.proyectoalmacenamiento.ui.theme.ProyectoAlmacenamientoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoAlmacenamientoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
/*

Ejercicio:

Crear un menú con el registro datos y visualización de datos.
1.- Activity 1 que permita guardar y/o modificar si existen:

Nombre
Apellido
Email
Celular
Sucursal

Guardar esta información en un Shared Preferences

2.- Activity 2 mostrar datos:

Recuperar los datos almacenados en Shared Preferences y mostrar en la pantalla.

 */



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
    ProyectoAlmacenamientoTheme {
        Greeting("Android")
    }
}