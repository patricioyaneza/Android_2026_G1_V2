package com.example.proyectodonaciones.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonaciones.R
import com.example.proyectodonaciones.controller.DonationController
import com.example.proyectodonaciones.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val controller = DonationController()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtNuevaDonacion.requestFocus()

        binding.btnHacerDonacion.setOnClickListener {
            val newDonation = binding.txtNuevaDonacion.text.toString().toIntOrNull()
            if (newDonation != null) {
                if(controller.save(newDonation))
                {
                    binding.txtTotalDonacion.text = controller.getTotalAmount().toString()
                    binding.txtNuevaDonacion.setText("")
                    binding.txtNuevaDonacion.requestFocus()
                    Toast.makeText(this, "Donación realizada con éxito", Toast.LENGTH_SHORT).show()
                }
            }
            else
            {
                Toast.makeText(this, "Ingrese una donación válida", Toast.LENGTH_SHORT).show()
                binding.txtNuevaDonacion.setError("Ingrese una donación válida")
                binding.txtNuevaDonacion.setText("")
                binding.txtNuevaDonacion.requestFocus()
            }
        }
    }
}