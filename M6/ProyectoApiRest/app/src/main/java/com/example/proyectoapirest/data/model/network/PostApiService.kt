package com.example.proyectoapirest.data.model.network

import com.example.proyectoapirest.data.model.Post
import retrofit2.http.GET
import retrofit2.http.Path

interface PostApiService {

    @GET("posts")
    suspend fun getPosts(): List<Post>

    @GET("posts/{id}")
    suspend fun getPostById(@Path("id") id: Int): Post

}