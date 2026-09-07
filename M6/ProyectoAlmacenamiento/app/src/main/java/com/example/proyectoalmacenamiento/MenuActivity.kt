package com.example.proyectoalmacenamiento

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoalmacenamiento.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            val intent = Intent(this, GuardarActivity::class.java)
            startActivity(intent)
        }
        binding.btnMostrar.setOnClickListener {
            val intent = Intent(this, MostrarActivity::class.java)
            startActivity(intent)
        }
    }
}