package com.example.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contextkullanimi.databinding.ActivityMainBinding

//Context içinde bulunduğumuz activityden bir parça
//Kullanılan bazı yapılar context girmemizi bekler(yani activitymizden bir parça bekler)
//Genelde parametre olarak değeri veririz.
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}