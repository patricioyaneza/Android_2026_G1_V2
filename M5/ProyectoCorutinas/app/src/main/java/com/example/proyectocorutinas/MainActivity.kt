package com.example.proyectocorutinas


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectocorutinas.databinding.ActivityMainBinding
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSolicitar.setOnClickListener{

            lifecycleScope.launch {
                binding.txtMensaje.text = "Solicitud enviada..."
                delay(10000)
                binding.txtMensaje.text = "¡¡¡ Solicitud finalizada !!!"
            }
        }

        binding.btnAumentar.setOnClickListener {
            contador++
            binding.txtContador.text = contador.toString()
        }

    }

}