package com.example.proyectoalmacenamiento

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectoalmacenamiento.data.AppDatabase


import com.example.proyectoalmacenamiento.databinding.ActivityGuardarSqliteBinding
import com.example.proyectoalmacenamiento.model.UsuarioModel
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

            val db = AppDatabase.getDatabase(this)
            val usuarioDAO = db.usuarioDao()
            lifecycleScope.launch {

                val usuario = UsuarioModel(
                    nombre = nombre,
                    apellido = apellido,
                    email = email,
                    celular = celular,
                    sucursal = sucursal
                )
                usuarioDAO.insert(usuario)
                Toast.makeText(this@GuardarSQLiteActivity, "Usuario guardado exitosamente", Toast.LENGTH_SHORT).show()

                binding.txtNombre.setText("")
                binding.txtApellido.setText("")
                binding.txtEmail.setText("")
                binding.txtCelular.setText("")
                binding.txtSucursal.setText("")
                binding.txtNombre.requestFocus()

                val usuarios = usuarioDAO.getAll()

                for(usuario in usuarios){
                    println("Usuario: ${usuario.nombre}")
                }
                /*
                    Ejercicio: En un listView, mostrar nombre, apellido y sucursal de cada usuario.
                    (1 layout -> linear layout horizontal y 3 textView)
                 */

            }
        }
    }
}