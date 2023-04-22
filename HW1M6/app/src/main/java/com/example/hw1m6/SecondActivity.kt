package com.example.hw1m6

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.hw1m6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private  lateinit var  binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        binding.
            etTv.setText(intent.getStringExtra("text"))
          binding.click.setOnClickListener {
              intent.putExtra("text",binding.click.text.toString())
              setResult(Activity.RESULT_OK,intent)
              finish()
          }
        }
    }
