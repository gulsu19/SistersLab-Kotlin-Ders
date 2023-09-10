package com.example.sharedreferencekullanimi

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedreferencekullanimi.databinding.ActivityMainBinding

//SharedPreferences
//Basit verileri kalıcı tutmak için kullanılır.
//Kaydettiğimiz bilgileri uygulamayı kapatsak bile kaybetmeyiz.
//Uygulamayı(apk) telefonumuzdan sildiğimizde bu kayıtlar silinir.
//SharedPreferences kayıt işlemi key - value şeklinde tutulur.
//Daha detaylı kayıt işlemlerinde, kritik verilerle işlemlerde veri tabanı kullanılır.
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("Kişisel Bilgiler",Context.MODE_PRIVATE) //Silinme önceliği belirtir, en son bu kaydı sil
        val editor = sharedPreferences.edit()//veri kaydı değişikliği yetkisi almak için

        //Verileri silme işlemi
        editor.remove("ad")
        editor.commit()

        /*editor.putString("ad","Gülsu")
        editor.putInt("yas",21)
        editor.putFloat("boy",1.67f)
        editor.putBoolean("ogrenciMi",true)

        val arkadasListesi = HashSet<String>()
        arkadasListesi.add("Gülşah")
        arkadasListesi.add("Zeynep")
        arkadasListesi.add("Begüm")
        arkadasListesi.add("Nursel")
        arkadasListesi.add("Nurdan")

        editor.putStringSet("arkadasListesi", arkadasListesi)

        editor.commit()
         */

        binding.buttonGit.setOnClickListener {
            startActivity(Intent(this@MainActivity,ActivityDetail::class.java))

        }


    }
}