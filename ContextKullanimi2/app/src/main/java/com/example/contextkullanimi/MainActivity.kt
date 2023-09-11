package com.example.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contextkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //1.Kullanım
           // Toast.makeText(this"Merhaba",Toast.LENGTH_SHORT).show()
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_SHORT).show()
        }
    }
}