package com.example.proyectodonacionesg2.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectodonacionesg2.controller.DonationController
import com.example.proyectodonacionesg2.databinding.ActivityMainBinding
import com.example.proyectodonacionesg2.model.Donacion

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // importar la clase de enlace de vista
    private val controller = DonationController()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtNuevaDonacion.requestFocus()
        binding.btnHacerDonacion.setOnClickListener { hacerDonacion() }
        binding.btnDonacionObject.setOnClickListener {
            val nuevaDonacion = binding.txtNuevaDonacion.text.toString().toIntOrNull()
            Donacion.saveDonation(nuevaDonacion ?: 0)
            binding.txtTotalDonacion.text = Donacion.totalAmount.toString()
        }
        binding.btnIr.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }

    fun hacerDonacion() {
        val nuevaDonacion = binding.txtNuevaDonacion.text.toString().toIntOrNull()
        if (nuevaDonacion != null) {
            if (controller.saveDonation(nuevaDonacion)) {
                binding.txtTotalDonacion.text = controller.totalDonation().toString()
                Toast.makeText(this, "Donación realizada con éxito", Toast.LENGTH_SHORT).show()
            }
        }
        else {
            Toast.makeText(this, "Ingrese una cantidad válida", Toast.LENGTH_SHORT).show()
        }
        binding.txtNuevaDonacion.setText("")
        binding.txtNuevaDonacion.requestFocus()
    }
}