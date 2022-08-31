package com.example.telefoniamovil.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.Violation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telefoniamovil.Adaptadores.Adaptador
import com.example.telefoniamovil.Adaptadores.AdaptadorVisor
//import com.example.telefoniamovil.Adaptadores.AdaptadorVisor
import com.example.telefoniamovil.Clases.MarcasDeTelefonia
import com.example.telefoniamovil.Clases.VisorItem
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_visor_i.*
import kotlinx.android.synthetic.main.card_view.*

class VisorI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visor_i)
       rvVisorI.layoutManager = LinearLayoutManager(this)
       rvVisorI.adapter= AdaptadorVisor(visor(),this)

      // val imagen = intent.getSerializableExtra("img") as VisorItem
        //imgCardView.setImageResource(imagen.imgVisor)

    }

    private fun visor(): ArrayList<VisorItem> {

        var visorIt = ArrayList<VisorItem>()

        visorIt.add(VisorItem(R.drawable.samsung,""))






        return visorIt
    }
}