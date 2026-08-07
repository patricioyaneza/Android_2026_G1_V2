package com.example.proyectokotlin

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnAceptar = findViewById<ImageButton>(R.id.btnAceptar)
        val txtEmail = findViewById<TextInputEditText>(R.id.txtEmail)


        btnAceptar.setOnClickListener {
//            Toast.makeText(this, "Boton Aceptar", Toast.LENGTH_SHORT).show()
            var sp = getSharedPreferences("misDatos", MODE_PRIVATE)
            sp.edit().putString("email", txtEmail.text.toString()).apply()

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)

        }

    }
}