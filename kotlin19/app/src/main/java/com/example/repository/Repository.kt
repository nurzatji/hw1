package com.example.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.remote.RetrofitClient
import com.example.remote.model.Model
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    fun  getInfo(name:String):MutableLiveData<Model>{
        val liveData = MutableLiveData<Model>()
        RetrofitClient().create().getInfo(name).enqueue(object : Callback<Model> {
            override fun onResponse(call: Call<Model>, response: Response<Model>) {
                if (response.isSuccessful) {
                    liveData.postValue(response.body())

                }
            }

            override fun onFailure(call: Call<Model>, t: Throwable) {
                Log.e("ololo", "onFailure: ${t.message}",)


            }
        })
        return  liveData
            }

        }


