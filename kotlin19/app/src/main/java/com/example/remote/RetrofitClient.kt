package com.example.remote

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    fun  create(): ApiSecvice{
        val retrofit = Retrofit.Builder().baseUrl("https://celebrity-by-api-ninjas.p.rapidapi.com").addConverterFactory(GsonConverterFactory.create()).build()
        return  retrofit.create(ApiSecvice::class.java)
    }
}