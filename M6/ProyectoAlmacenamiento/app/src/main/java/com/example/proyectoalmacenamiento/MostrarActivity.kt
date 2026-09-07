package com.example.proyectoalmacenamiento

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoalmacenamiento.databinding.ActivityMostrarBinding

class MostrarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMostrarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMostrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val sp = getSharedPreferences("datosusuario", MODE_PRIVATE)
        val nombre = sp.getString("nombre", "")
        val apellido = sp.getString("apellido", "")
        val email = sp.getString("email", "")
        val celular = sp.getString("celular", "")
        val sucursal = sp.getString("sucursal", "")
        binding.txtNombre.setText(nombre)
        binding.txtApellido.setText(apellido)
        binding.txtEmail.setText(email)
        binding.txtCelular.setText(celular)
        binding.txtSucursal.setText(sucursal)
    }

}