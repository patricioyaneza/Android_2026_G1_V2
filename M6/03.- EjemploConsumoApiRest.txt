package com.example.proyectoapirest

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.proyectoapirest.data.network.RetrofitCliente
import com.example.proyectoapirest.databinding.ActivityPostBinding
import kotlinx.coroutines.launch

class PostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerPost.setOnClickListener {

            lifecycleScope.launch {
                try {
                    val respuesta = RetrofitCliente.instancia.getPosts()
                    val posts = respuesta.map { it.title }.toMutableList()
                    
                    val adapter = ArrayAdapter(this@PostActivity, android.R.layout.simple_list_item_1, posts)
                    binding.listadoPost.adapter = adapter
                }
                catch (e: Exception) {
                    Toast.makeText(this@PostActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }

            }
        }

    }
}