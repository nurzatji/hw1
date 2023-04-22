package com.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.remote.model.Model
import com.example.repository.Repository

class MainViewModel:ViewModel() {
    private val repository = Repository()
    fun  getInfo(name: String):LiveData<Model>{
        return  repository.getInfo(name)
    }
}