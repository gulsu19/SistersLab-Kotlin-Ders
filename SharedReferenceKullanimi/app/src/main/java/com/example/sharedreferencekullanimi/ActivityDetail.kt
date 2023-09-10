package com.example.sharedreferencekullanimi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedreferencekullanimi.databinding.ActivityDetailBinding

class ActivityDetail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("Kişisel Bilgiler", Context.MODE_PRIVATE)

        val ad = sharedPreferences.getString("ad","isim yok")
        val yas = sharedPreferences.getInt("yas",0)
        val boy = sharedPreferences.getFloat("boy",0.0f)
        val ogrenciMi = sharedPreferences.getBoolean("ogrenciMi", false)

        val liste = sharedPreferences.getStringSet("arkadasListesi",null)

        //Textview öğelerine değerleri atama işlemi
        binding.adTextView.text = "Ad: $ad"
        binding.yasTextView.text = "Yaş: $yas"
        binding.boyTextView.text = "Boy: $boy"
        binding.ogrenciMiTextView.text = "Öğrenci mi: $ogrenciMi"
        binding.arkadasListesiTextView.text = "Arkadaş Listesi: ${liste?.joinToString(",")?: "Yok"}"

    }
}