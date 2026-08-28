package com.example.proyectodonaciones.view

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectodonaciones.R
import com.example.proyectodonaciones.model.DonacionModelo
import com.example.proyectodonaciones.model.DonationModel

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var txtValor = findViewById<TextView>(R.id.txtValor)
        txtValor.text = DonacionModelo.totalAmount.toString()

        var txtValorRecibido = findViewById<TextView>(R.id.txtValorRecibido)
        txtValorRecibido.text = intent.getIntExtra("dato", 0).toString()


    }
}