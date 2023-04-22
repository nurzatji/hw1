
package com.example.hw1

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
    }

    private fun initListener() {
        with(binding){
            editSecond.setText(intent.getStringExtra("text"))
            btnClickSecond.setOnClickListener {
                intent.putExtra("text",btnClickSecond.text.toString())
                setResult(Activity.RESULT_OK,intent)
                finish()
            }

        }
    }
}