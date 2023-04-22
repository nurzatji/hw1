package com.example.remote.model

import com.google.gson.annotations.SerializedName

data  class itemModel (
val name:String?,
@SerializedName("gender")
val human:String?,
val nationality:String?,
  val  occupation:String?,
val height: Double?,
val  birthday :String?,
val age:Int ?,
@SerializedName("is_alive")
val isAlive:Boolean?
         )