package com.example.telefoniamovil.Adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.telefoniamovil.Activities.MainSamsung
import com.example.telefoniamovil.Activities.SamsungInfoComp
import com.example.telefoniamovil.Clases.MarcasDeTelefonia
import com.example.telefoniamovil.Clases.VisorItem
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.card_view.view.*
import kotlinx.android.synthetic.main.marcas_telefonia.view.*

class AdaptadorVisor (private val visorIt : ArrayList<VisorItem>, val contexto: Context):RecyclerView.Adapter<AdaptadorVisor.objetos>(){

    class objetos (var vista : View, var contexto: Context): RecyclerView.ViewHolder(vista){
        fun adapObjetosVisor(visoritem : VisorItem){
            vista.imgCardView.setImageResource(visoritem.imgVisor)

            vista.setOnClickListener(){
                contexto.startActivity(Intent(contexto,MainSamsung::class.java))//.putExtra("descripcion",visoritem))
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): objetos {
        return objetos(LayoutInflater.from(parent.context).inflate(R.layout.card_view,parent,false),contexto)
    }

    override fun onBindViewHolder(holder: objetos, position: Int) {

       holder.adapObjetosVisor(visorIt[position])
    }

    override fun getItemCount(): Int {
        return visorIt.size
    }
}