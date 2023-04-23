package com.example.hw1m6

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

import com.example.hw1m6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        if (it.resultCode == Activity.RESULT_OK && it.data !=null){
            val getText = it.data?.getStringExtra("text")
            binding.etText.setText(getText)
        }
    }

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()

//        Дз: На первой активити добавить EditText + Button, при вводе если значения
//        в editText пустое и вы нажали на button, то отобразить Toast, что EditText
//        не может быть пустым, иначе Перейти на вторую активити и отобразить значение
//        в EditText, также добавить Button, если EditText не пуст, то вернуться на 1
//        активити и отобразить текст из 2 активити.(использовать registerForActivity)
    }

    @SuppressLint("SuspiciousIndentation")
    private fun initListener() {
        binding.btnClick.setOnClickListener {
            if (binding.etText.text.isEmpty()){
                Toast.makeText(this, "Edittext не должен быть пустым!", Toast.LENGTH_SHORT).show()
        }     else {
            val intent = Intent(this,SecondActivity::class.java)
                intent.putExtra("text",binding.etText.text.toString())
register.launch(intent)

            }
        }
     
    }
}