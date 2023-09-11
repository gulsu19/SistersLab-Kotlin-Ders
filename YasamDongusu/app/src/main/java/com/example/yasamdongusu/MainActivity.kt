package com.example.yasamdongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


//Android uygulamasının bir parçası. Activity Kullanıcının gördüğü arayüz. Bir uygulama birden fazla activity içerebilir.
/*
Activity Yaşam Döngüsü
Activitynin yaratılması, duraklatılması, yeniden başlatması, durdurulması ve yok edilmesi gibi durumlar.
onCreta(): Bu metod ile birlikte aktivite yaratılır.
onStart(): Bu metod ile virlikte aktivite artık kullanıcı tarafından görünür.
onResume(): Bu metod ile birlikte kullanıcı artık uygulama ile karşılıklı iletişim halindedir.
onPause(): Bununla beraber artık kullanıcıdan herhangi bir girdi alamaz ve hiçbir kod çalıştırılamaz.
onStop(): Artık aktivite görünür durumda değildir.
onDestroy(): Aktivite sistem tarafından yok  edilmeden önce bu metod çağrılır.
onRestart(): Aktivite durdurulduktan sonra tekrar başlatılmak için bu metod kullanılır.

 ****Uygulama İlk Çalıştığında****
onCreate()
onStart()
onResume()

****Back Tuşuna Basıldığında****
onPause()
onStop()
onDestroy()

****Arka Plandan Tekrar Çağrıldığında****
onCreate()
onStart()
onResume()

****Menü Tuşu****
onPause()
onStop()

****Arka Plandan Tekrar Çağrıldığında****
onRestart()
onStart()
onResume()
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate","Çalıştı")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Çalıştı")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","Çalıştı")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Çalıştı")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Çalıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Çalıştı")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Çalıştı")
    }










}