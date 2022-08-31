package com.example.telefoniamovil.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telefoniamovil.Clases.SamsungItem
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.activity_samsung_info_comp.*

class SamsungInfoComp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samsung_info_comp)

       var detallesSamsung = intent.getSerializableExtra("imgSamsung") as SamsungItem
        imgSamsungInfo.setImageResource(detallesSamsung.idImgSamsung)
        txtSamsungInfo.text = detallesSamsung.infoSaumsung

    }
}