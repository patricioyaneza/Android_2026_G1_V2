package com.example.proyectodonaciones.view

import android.os.Bundle
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonaciones.R
import com.example.proyectodonaciones.databinding.ActivityList3Binding

class List3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityList3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityList3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val usuarios = mutableListOf(
            mapOf("Nombre" to "Juan", "Apellido" to "Díaz", "Edad" to "30"),
            mapOf("Nombre" to "Ana", "Apellido" to "Aros", "Edad" to "20"),
            mapOf("Nombre" to "Pedro", "Apellido" to "Adams", "Edad" to "33"),
            mapOf("Nombre" to "Diego", "Apellido" to "Fuentes", "Edad" to "28"),
            mapOf("Nombre" to "María", "Apellido" to "Peréz", "Edad" to "45"),
        )

        val adapter = SimpleAdapter(
            this,
            usuarios,
            R.layout.item_lista_usuario,
            arrayOf("Nombre", "Apellido", "Edad"),
            intArrayOf(R.id.txtNombre, R.id.txtApellido, R.id.txtEdad)
        )
        binding.listadoUsuarios.adapter = adapter
    }

}