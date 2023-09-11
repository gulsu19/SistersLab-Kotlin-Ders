package com.example.recyclerviewvecardview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

//Adapter recycler yapısında kullanacağımız veri kümesini organize eder.
//ArrayList oluşturmamız gerekir.
//Adapter tarafında hangi componenti hangi veri kümesine eşitleneceğini belirtir.
class RVAdapter(private val mContext:Context, private val ulkelerDisardanGelenListe:List<Ulkeler>)
    :RecyclerView.Adapter<RVAdapter.CardViewTasarimNesneleriniTutucu>(){

    inner class CardViewTasarimNesneleriniTutucu(view: View) : RecyclerView.ViewHolder(view) {
        var satirCardView: CardView
        var satirYazi: TextView
        var noktaResim: ImageView

        init {
            satirCardView = view.findViewById(R.id.satirCardView)
            satirYazi = view.findViewById(R.id.satirYazi)
            noktaResim = view.findViewById(R.id.noktaResim)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewTasarimNesneleriniTutucu {
        //CardTasarim sınıfından bir nesne girmemiz bekleniyor.
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)

        return CardViewTasarimNesneleriniTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        //RecyclerViewdekaç tane verimi görüntüleyeceğimi belirttiğim yer oluyor.
        return ulkelerDisardanGelenListe.size
    }

    override fun onBindViewHolder(holder: CardViewTasarimNesneleriniTutucu, position: Int) {
        val ulke = ulkelerDisardanGelenListe[position]
        holder.satirYazi.text = ulke.ulkeAdi

        holder.satirCardView.setOnClickListener {
            Toast.makeText(mContext,"Seçtiğiniz Ülke : ${ulke.ulkeAdi}",Toast.LENGTH_SHORT).show()
        }

        holder.noktaResim.setOnClickListener {
            val popup = PopupMenu(mContext,holder.noktaResim)

            //Hangi tasarımı gösterecek
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)
            popup.show()

            popup.setOnMenuItemClickListener {item ->

            when(item.itemId){
                R.id.action_sil -> {
                    Toast.makeText(mContext,"${ulke.ulkeAdi} verisi silinsin mi?",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_duzenle -> {
                    Toast.makeText(mContext,"${ulke.ulkeAdi} verisi düzenlensin mi?",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_favori -> {
                    Toast.makeText(mContext,"${ulke.ulkeAdi}favorilere eklensin mi?",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.action_favoriCikar -> {
                    Toast.makeText(mContext,"${ulke.ulkeAdi}favorilerden çıkarılsın mı?",Toast.LENGTH_SHORT).show()
                    true

                }else -> false
            }

            }
        }
    }

}
