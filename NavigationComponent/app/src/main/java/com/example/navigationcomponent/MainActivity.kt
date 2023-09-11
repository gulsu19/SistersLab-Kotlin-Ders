package com.example.navigationcomponent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
/*
Navigation Component
Fragmentler arası (sayfalar arası) geçişleri daha pratik yapmamıza olanak tanır.
Activity üzerinde istediğimiz şekilde fragment geçişleri yapabiliriz.
Geçişlerde veri transferlerini yapabiliriz.

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}