package com.example.proyectoalmacenamiento

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


import com.example.proyectoalmacenamiento.databinding.ActivityGuardarSqliteBinding


class GuardarSQLiteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuardarSqliteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuardarSqliteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}