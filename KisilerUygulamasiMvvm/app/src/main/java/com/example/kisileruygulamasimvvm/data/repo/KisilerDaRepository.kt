package com.example.kisileruygulamasimvvm.data.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.kisileruygulamasimvvm.data.entity.Kisiler

class KisilerDaRepository {

    var kisilerListesi: MutableLiveData<List<Kisiler>>

    init {
        kisilerListesi = MutableLiveData()
    }

    fun kisileriGetir() : MutableLiveData<List<Kisiler>>{
        return kisilerListesi
    }

    fun kisiKayit(kisiAd:String, kisiTel:String){
        Log.e("Kişi Kayıt","$kisiAd - $kisiTel")
    }

    fun kisiGuncelle(kisiId: Int,kisiAd: String, kisiTel: String){
        Log.e("Kişi Güncelle","$kisiAd - $kisiAd - $kisiTel")
    }

    fun kisiAra(aramaKelimesi:String){
        Log.e("Kişi Ara",aramaKelimesi)
    }

    fun kisiSil(kisiId: Int, ){
        Log.e("Kişi Sil", kisiId.toString())
    }

    fun tumKisileriAl(){

        val liste = ArrayList<Kisiler>()
        val k1 = Kisiler(1,"Ahmet","1111")
        val k2 = Kisiler(2,"Helin","2222")
        val k3 = Kisiler(3,"Orcan","444")
        val k5 = Kisiler(4,"Döne","7777")
        val k6 = Kisiler(4,"Büşra","6666")
        val k7 = Kisiler(4,"Nazlıcan","0000")
        val k8 = Kisiler(4,"Türkan","8598")
        val k9 = Kisiler(4,"Can","85847")

        liste.add(k1)
        liste.add(k2)
        liste.add(k3)
        liste.add(k5)
        liste.add(k6)
        liste.add(k7)
        liste.add(k8)
        liste.add(k9)

        kisilerListesi.value = liste
    }
}