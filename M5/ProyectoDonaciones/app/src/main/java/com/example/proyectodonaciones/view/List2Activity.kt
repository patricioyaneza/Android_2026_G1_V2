package com.example.proyectodonaciones.view

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SimpleAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectodonaciones.databinding.ActivityList2Binding


class List2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityList2Binding
    private val productos = mutableListOf(mapOf("Producto" to "", "Valor" to ""))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityList2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgregarTexto2.setOnClickListener {
            val texto = binding.txtTexto2.text.toString().trim().uppercase()
            val valor = binding.txtValor2.text.toString().trim()

            val producto = mapOf("Producto" to texto, "Valor" to valor)
            productos.add(producto)

            val adapter = SimpleAdapter(
                this,
                productos,
                R.layout.simple_list_item_2,
                arrayOf("Producto", "Valor"),
                intArrayOf(R.id.text1, R.id.text2)
            )
            binding.listado2.adapter = adapter

            binding.txtTexto2.setText("")
            binding.txtValor2.setText("")
            binding.txtTexto2.requestFocus()

/*
Tarea de investigación:  Crear una nueva activity y buscar como
mostrar una lista con 3 columnas: Nombre | apellido | edad
 */

        }
    }
}