package com.example.telefoniamovil.Adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telefoniamovil.Activities.MainSamsung
import com.example.telefoniamovil.Activities.SamsungInfoComp
import com.example.telefoniamovil.Clases.SamsungItem
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.activity_samsung.view.*
import kotlinx.android.synthetic.main.activity_samsung_info_comp.view.*
import kotlinx.android.synthetic.main.lysamsung.view.*

class AdaptadorSamsung(private val samsung: ArrayList<SamsungItem>, val contexto:Context):RecyclerView.Adapter<AdaptadorSamsung.objetosSamsung>(){

    class objetosSamsung (var vista : View, var contexto: Context):RecyclerView.ViewHolder(vista){
        fun adapObjetosS(samsungitem:SamsungItem){
            vista.imgSamsung.setImageResource(samsungitem.idImgSamsung)
            vista.txtNameSamnsung.text = samsungitem.nombre
            vista.txtInfoSamsung.text = samsungitem.infoSaumsung
            vista.txtPrecioSamsung.text=samsungitem.precio
            vista.ratingBarSamsung.rating = samsungitem.ratingBar.toFloat()

            vista.imgSamsung.setOnClickListener(){
                contexto.startActivity(Intent(contexto,SamsungInfoComp :: class.java).putExtra("imgSamsung",samsungitem))
            }

           // vista.txtSamsungInfo.setOnClickListener(){
             //   contexto.startActivity(Intent(contexto,SamsungInfoComp :: class.java).putExtra("infoSamsung",samsungitem))
            //}

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): objetosSamsung {

        return objetosSamsung(LayoutInflater.from(parent.context).inflate(R.layout.lysamsung,parent,false),contexto)
    }

    override fun onBindViewHolder(holder: objetosSamsung, position: Int) {
        holder.adapObjetosS(samsung[position])
    }

    override fun getItemCount(): Int {
       return samsung.size
    }
}