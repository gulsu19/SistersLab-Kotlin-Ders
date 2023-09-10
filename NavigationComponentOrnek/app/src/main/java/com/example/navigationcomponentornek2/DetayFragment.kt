package com.example.navigationcomponentornek2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentornek2.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var tasarim: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentDetayBinding.inflate(inflater,container,false)

        tasarim.buttonCiktiSayfasinaGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.actionCiktiSayfasıGecis)

        }
        //OLuşturduğumuz veriyi alma işlemleri
        val bundle: DetayFragmentArgs by navArgs()
        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenSoyad = bundle.soyad
        val gelenNesne = bundle.nesne

        Log.d("deneme",gelenAd)
        Log.d("deneme",gelenYas.toString())
        Log.d("deneme",gelenSoyad)
        Log.d("deneme",gelenNesne.kisiAd)
        Log.d("deneme",gelenNesne.kisiNo.toString())
        return tasarim.root
    }
}