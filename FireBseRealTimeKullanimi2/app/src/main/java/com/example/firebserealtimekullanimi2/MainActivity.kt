package com.example.firebserealtimekullanimi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firebserealtimekullanimi2.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

//Firebase
//Gerçek zamanlı çalışan veritabanı
//Veri tabanı üzerinde oluşan değişiklikler anlık yansır
//Json formatında çalışır

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database = FirebaseDatabase.getInstance()//Yetki aldım

        val refNesneler = database.getReference("nesneler")

        /*//Kayıt işlemi
        val nesne = Nesneler("Havuç",6,"Gıda Ürünü")
        refNesneler.push().setValue(nesne)
         */

        //Kayıt Silme
        //refNesneler.child("-NdGzj53AFk9h6f7aAP6").removeValue()

        /*
        //Kayıt Güncelleme
        val updateInfo = HashMap<String,Any>()

        updateInfo["nesneAd"] = "Pasta"
        updateInfo["nesneAdet"] = 12
        updateInfo["nesneAlani"] = "Tatlı"

        refNesneler.child("-NdGzZIV81vsWjJcmLpD").updateChildren(updateInfo)
         */

        refNesneler.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                for ( deger in snapshot.children){
                    val nesne = deger.getValue(Nesneler::class.java)
                    if( nesne != null){
                        Log.d("*********************","deneme")
                        Log.d("Nesne Ad",nesne.nesneAd.toString())
                        Log.d("Nesne Adet", nesne.nesneAdet.toString())
                        Log.d("Kullanım Alanı", nesne.nesneAlani.toString())
                    }
                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })


    }
}