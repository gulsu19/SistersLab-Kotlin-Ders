package com.example.firebserealtimekullanimi2

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class Nesneler( var nesneAd:String? = "", var nesneAdet:Int? = 0, var nesneAlani:String? = "") {
}