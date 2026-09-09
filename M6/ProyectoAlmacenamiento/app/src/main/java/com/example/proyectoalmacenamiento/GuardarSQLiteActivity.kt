package com.example.proyectoalmacenamiento

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectoalmacenamiento.data.AppDatabase


import com.example.proyectoalmacenamiento.databinding.ActivityGuardarSqliteBinding
import com.example.proyectoalmacenamiento.model.Usuario
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class GuardarSQLiteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuardarSqliteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGuardarSqliteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar2.setOnClickListener {
            val nombre = binding.txtNombre.text.toString()
            val apellido = binding.txtApellido.text.toString()
            val email = binding.txtEmail.text.toString()
            val celular = binding.txtCelular.text.toString()
            val sucursal = binding.txtSucursal.text.toString()

            lifecycleScope.launch {
                val db = AppDatabase.getDatabase(this@GuardarSQLiteActivity)
                val usuarioDAO = db.usuarioDao()

                val usuario = Usuario(
                    nombre = nombre,
                    apellido = apellido,
                    email = email,
                    celular = celular,
                    sucursal = sucursal
                )
                usuarioDAO.insert(usuario)

            }
            Toast.makeText(this, "Usuario guardado correctamente", Toast.LENGTH_SHORT).show()
        }

    }

    fun guardarUsuarios() {

    }
}