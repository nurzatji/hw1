package com.example.remote

import com.example.remote.model.Model
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiSecvice {
    @GET("v1/celebrity")
    fun getInfo(
        @Query("name") name:String?,
        @Header("X-RapidAPI-Key") key:String = "2237e8a8bdmsha1bfbb085966e45p1c9864jsn33808862401d",
    @Header("X-RapidAPI-Host") host:String = "celebrity-by-api-ninjas.p.rapidapi.com",
    ):Call<Model>
}