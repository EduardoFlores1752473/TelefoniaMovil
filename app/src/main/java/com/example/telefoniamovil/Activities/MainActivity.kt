package com.example.telefoniamovil.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telefoniamovil.Adaptadores.Adaptador
import com.example.telefoniamovil.Clases.MarcasDeTelefonia
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.marcas_telefonia.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvTelefonia.layoutManager = LinearLayoutManager(this)
        rvTelefonia.adapter = Adaptador(datos(), this)
    }

    private fun datos(): ArrayList<MarcasDeTelefonia> {

        var marca = ArrayList<MarcasDeTelefonia>()

        marca.add(MarcasDeTelefonia(R.drawable.huawie))
        marca.add(MarcasDeTelefonia(R.drawable.samsung))
        marca.add(MarcasDeTelefonia(R.drawable.huawie))

        return marca

    }
}



