package com.example.telefoniamovil.Adaptadores

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.telefoniamovil.Activities.VisorI
import com.example.telefoniamovil.Clases.MarcasDeTelefonia
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.marcas_telefonia.*
import kotlinx.android.synthetic.main.marcas_telefonia.view.*


class Adaptador(private val marca: ArrayList<MarcasDeTelefonia>, val contexto: Context):RecyclerView.Adapter<Adaptador.objetos>(){


    class objetos (var vista : View, var contexto: Context):RecyclerView.ViewHolder(vista){
        fun adapObjetos(marcasdetelefonia: MarcasDeTelefonia){
         vista.ivATT.setImageResource(marcasdetelefonia.Idimg)

           // vista.setOnClickListener() {

             //   contexto.startActivity(Intent(contexto, VisorI ::class.java))//.putExtra("img",libros))
            //}
            vista.ivATT.setOnClickListener(){
                contexto.startActivity(Intent(contexto, VisorI ::class.java))//.putExtra("img",libros))
            }


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): objetos {
    return objetos(LayoutInflater.from(parent.context).inflate(R.layout.marcas_telefonia,parent,false),contexto)
    }

    override fun onBindViewHolder(holder: objetos, position: Int) {

        holder.adapObjetos(marca[position])
    }

    override fun getItemCount(): Int {
     return marca.size
    }
}