package com.example.proyectoalmacenamiento

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectoalmacenamiento.databinding.ActivityGuardarBinding

class GuardarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuardarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuardarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGrabar.setOnClickListener {
            val nombre = binding.txtNombre.text.toString()
            val apellido = binding.txtApellido.text.toString()
            val email = binding.txtEmail.text.toString()
            val celular = binding.txtCelular.text.toString()
            val sucursal = binding.txtSucursal.text.toString()

            val sp = getSharedPreferences("datosusuario", MODE_PRIVATE)
            val editor = sp.edit()
            editor.putString("nombre", nombre).apply()
            editor.putString("apellido", apellido).apply()
            editor.putString("email", email).apply()
            editor.putString("celular", celular).apply()
            editor.putString("sucursal", sucursal).apply()


            binding.txtNombre.setText("")
            binding.txtApellido.setText("")
            binding.txtEmail.setText("")
            binding.txtCelular.setText("")
            binding.txtSucursal.setText("")

            Toast.makeText(this, "Datos grabados", Toast.LENGTH_SHORT).show()


        }
    }
}