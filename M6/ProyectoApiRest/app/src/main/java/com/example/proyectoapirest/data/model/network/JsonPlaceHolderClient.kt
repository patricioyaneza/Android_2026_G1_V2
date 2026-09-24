package com.example.proyectoapirest.data.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object JsonPlaceHolderClient {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    val postApiService: PostApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PostApiService::class.java)
    }
}