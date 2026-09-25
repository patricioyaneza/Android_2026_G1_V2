package com.example.proyectoapirest

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.lifecycle.lifecycleScope
import com.example.proyectoapirest.data.model.network.JsonPlaceHolderClient
import com.example.proyectoapirest.databinding.ActivityListadoBinding
import kotlinx.coroutines.launch

class ListadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCargarPost.setOnClickListener {
            lifecycleScope.launch {

                try{
                    val respuesta = JsonPlaceHolderClient.postApiService.getPosts()
//                    for (post in respuesta){
//                        println(post.id.toString() + " " + post.title)
//                    }

                    val titulosPosts = respuesta.map { it.title }.toMutableList()

                    val adapter = ArrayAdapter(
                        this@ListadoActivity,
                        R.layout.simple_list_item_1,
                        titulosPosts
                    )
                    binding.lvListadoPost.adapter = adapter
                    Toast.makeText(this@ListadoActivity, "Post fueron cargados", Toast.LENGTH_SHORT).show()

                }
                catch (e: Exception){
                    Toast.makeText(this@ListadoActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnVer.setOnClickListener {
            lifecycleScope.launch {
                try {
                    val respuesta = JsonPlaceHolderClient.postApiService.getPostsByUserId(binding.txtIdUsuario.text.toString().toInt())
                    val adapter = ArrayAdapter(
                        this@ListadoActivity,
                        R.layout.simple_list_item_1,
                        respuesta.map { it.title }
                    )
                    binding.lvListadoPost.adapter = adapter
                    Toast.makeText(this@ListadoActivity, "Post del usiario fueron cargados", Toast.LENGTH_SHORT).show()
                }
                catch (e: Exception){
                    Toast.makeText(this@ListadoActivity, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}