package com.example.homwork7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.homwork7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addButton.setOnClickListener {
            addEditText()
        }
    }
    private fun addEditText(){
        if(binding.fieldName.text.toString().isEmpty()){
            Toast.makeText(applicationContext, "Please enter the name"
                        ,Toast.LENGTH_SHORT).show()
            return
        }
        binding.fields.addView(MyDynamicEditText(this,binding.fieldName.text
                                                .toString(),binding.isNumeric.isChecked)
                                                .frameLayout, 0)
    }
}