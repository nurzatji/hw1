package com.example.hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.text.set
import com.example.hw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
       if (it.resultCode == Activity.RESULT_OK && it.data !=null ){
           val getText = it.data?.getStringExtra("text")
           binding.editFirst.setText(getText)
       }

    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListeners()

    }

    private fun initListeners() {
      with(binding){
          btnClickFirst.setOnClickListener {
              if (editFirst.text.isEmpty()){
                  Toast.makeText(this@MainActivity, "Edittext не должен быть пустым", Toast.LENGTH_SHORT).show()

              } else {
                  val  intent = Intent(this@MainActivity,SecondActivity::class.java)
                  intent.putExtra("text",editFirst.text.toString())
register.launch(intent)
              }
          }
      }
    }
}