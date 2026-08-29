package com.example.proyectodonaciones.view

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectodonaciones.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    private val textos = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAgregarTexto.setOnClickListener {
            var texto = binding.txtTexto.text.toString().trim().uppercase()
            textos.add(texto)
            binding.listado.adapter = ArrayAdapter(this, R.layout.simple_list_item_1, textos)
            binding.txtTexto.setText("")
            binding.txtTexto.requestFocus()
        }
    }
}