package com.example.navigationcomponent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
    }


}