package com.example.telefoniamovil.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.telefoniamovil.Adaptadores.AdaptadorSamsung
import com.example.telefoniamovil.Clases.SamsungItem
import com.example.telefoniamovil.R
import kotlinx.android.synthetic.main.activity_samsung.*
import kotlinx.android.synthetic.main.marcas_telefonia.*

class MainSamsung : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samsung)
        rvSamsung.layoutManager= LinearLayoutManager (this)
        rvSamsung.adapter = AdaptadorSamsung(datosSamsung(),this)


    }

    private fun datosSamsung(): ArrayList<SamsungItem>{

        var samsung = ArrayList<SamsungItem>()

        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a10s,"Samsung Galaxy A10s","$ 3,586.37","•Compatible con la mayoría de operadores GSM como T-Mobile, AT&T, MetroPCS, etc. Modelo internacional de teléfono. No funcionará con operadores CDMA, como Verizon, Sprint, Boost.","•Compatible con la mayoría de operadores GSM como T-Mobile, AT&T, MetroPCS, etc. Modelo internacional de teléfono. No funcionará con operadores CDMA, como Verizon, Sprint, Boost.\n •Pantalla táctil capacitiva IPS LCD de 6.2 pulgadas, 16 millones de colores, procesador Mediatek MT6762 Helio P22 (12 nm), Octa-core\n •Dual SIM, desbloqueado, Android 9.0 (Pie), Samsung One UI; 32 GB de almacenamiento ampliable con tarjeta SD de hasta 512 GB + 2 GB de RAM\n •Cámara trasera dual de 13 MP + 2 MP (F1.8), cámara frontal de 8 MP (F2.0), no tiene NFC\n •Bandas 2G: GSM 850/900/1800/1900, bandas 3G: HSDPA 850 / 900 / 1900 / 2100, bandas 4G: Banda LTE B1(2100), B2(1900), B3(1800), B4(AWS), B5(850), B7(2600), B8(900), B12(700), B17(700), B28(700).",3.5))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a21s,"Samsung Galaxy A21s","$4,099.00","•6.5, PLS TFT LCD Display, 720 x 1600 (HD+), 16M Color Depth\n•32GB Storage, 3GB RAM, Up to 512GB MicroSD","•\t6.5\", PLS TFT LCD Display, 720 x 1600 (HD+), 16M Color Depth\n •32GB Storage, 3GB RAM, Up to 512GB MicroSD\n•Android, 2.0 GHz Octa-Core, Non- Removable 5000mAh Battery (Talk Time : Up to 54)\n •Rear Camera : 48.0 MP + 8.0 MP + 2.0 MP + 2.0 MP | Digital Zoom up to 8x | Front Camera : 13.0 MP\n •REGIONAL LOCK will be removed by activating (opening) unit prior to shipping.",3.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a31,"Samsung Galaxy A31","$6,429.00","•Pantalla de 6.40 pulgadas (1080x2400).\n •Procesador MediaTek Helio P65\n •Cámara trasera 48MP + 8MP + 5MP + 5MP + Cámara frontal 20MP\n","•Pantalla de 6.40 pulgadas (1080x2400).\n •Procesador MediaTek Helio P65\n •Cámara trasera 48MP + 8MP + 5MP + 5MP + Cámara frontal 20MP\n•Capacidad de la batería: 5000 mAh.\n •Los teléfonos celulares desbloqueados son compatibles con los portadores GSM como AT&T y T-Mobile, pero no son compatibles con portadores CDMA como Verizon y Sprint.",4.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a50s,"Samsung Galaxy A50s","$8,438.35","•Pantalla: 6.4 pulgadas (Super AMOLED)\n•Resolución: 2,340x1,080 pixeles\n•Procesador: Exynos 9610\n•RAM: 4GB, 6GB\n","•Pantalla: 6.4 pulgadas (Super AMOLED)\n •Resolución: 2,340x1,080 pixeles\n•Procesador: Exynos 9610\n•RAM: 4GB, 6GB\n•Almacenamiento: 64GB, 128GB\n•Ranura microSD: sí\n•Batería: 4,000mAh\n•Lector de huellas: Sí, en pantalla\n•Cámaras traseras 25 megapixeles + 8 megapixeles + 5 megapixeles\n•Cámara frontal: 25 megapixeles\n•NFC: Sí\n•Samsung Pay: Sí\n•Tamaño: 158.5x74.7x7.7mm",4.5))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a51,"Samsung Galaxy A51","$7,395.42","•Pantalla: 164.0 mm (6.5), Pantalla Infinity-O, Super AMOLED, Resolución: 1080 x 2400 (FHD+), profundidad de color: 16M.\n •RAM: 4 GB, ROM: 128 GB, MicroSD (hasta 512 GB), Octa-Core, 2.3 GHz, 1.7 GHz, Exynos 9611, 4000 mAh batería, escáner de huellas dactilares en pantalla","•Pantalla: 164.0 mm (6.5), Pantalla Infinity-O, Super AMOLED, Resolución: 1080 x 2400 (FHD+), profundidad de color: 16M.\n•RAM: 4 GB, ROM: 128 GB, MicroSD (hasta 512 GB), Octa-Core, 2.3 GHz, 1.7 GHz, Exynos 9611, 4000 mAh batería, escáner de huellas dactilares en pantalla\n•Cámara trasera cuádruple: 48 MP + 12 MP + 5 MP + 5 MP, zoom de la cámara trasera: Zoom digital de hasta 8x, cámara frontal: 32 MP.\n•2G: GSM850, GSM900, DCS1800, PCS1900, 3G: UMTSB1(2100), B2(1900), B4(AWS), B5(850), B8(900), 4G: FDD LTEB1(2100), B2(1900), B3(1800), B4(AWS), B5(850), B7(2600), B8(900), B12(700), B13(700), B17(700), B20(800), B26(850), B28(700), B66(AWS-3), 4G: TDD LTEB38(2600), B40(2300), B41(2500)\n•Modelo internacional. Compatible con la mayoría de operadores GSM como T-Mobile, AT&T, MetroPCS, etc. No funcionará con operadores CDMA, como Verizon, Sprint, Boost.",5.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a71,"Samsung Galaxy A71","$8,379.00","•Pantalla Super AMOLED Plus de 6.7,con 1080 x 2400 píxeles, relación 20:9, Android 10.0, One UI 2, Dual SIM (Nano-SIM, Dual Stand-by), Huella dactilar (bajo pantalla, óptica)\n •128 GB ROM, 6 GB RAM, MicroSD (hasta 512 GB), Qualcomm SDM730 Snapdragon 730 (8 nm), Octacore (2x2.2 GHz Kryo 470 dorado y 6x1.8 GHz Kryo 470 plateado)","•Pantalla Super AMOLED Plus de 6.7, con 1080 x 2400 píxeles, relación 20:9, Android 10.0, One UI 2, Dual SIM (Nano-SIM, Dual Stand-by), Huella dactilar (bajo pantalla, óptica)\n •128 GB ROM, 6 GB RAM, MicroSD (hasta 512 GB), Qualcomm SDM730 Snapdragon 730 (8 nm), Octacore (2x2.2 GHz Kryo 470 dorado y 6x1.8 GHz Kryo 470 plateado)\n •Cámara trasera: 64 MP (F1.8) + 12 MP (F2.2) + 5 MP (F2.4) + 5 MP (F2.2), cámara frontal 32 MP (F2.2), conector de 3.5 mm: Sí, batería de 4500 mAh, cargador superrápido de 25 W.\n •Bandas 2G: GSM 850/900/1800/1900, bandas 3G: HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100, bandas 4G: Banda LTE 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 17(700), 20(800), 28(700), 38(2600), 40(2300), 41(2500), 66(1700/2100)\n •Versión internacional. Modelo internacional compatible con la mayoría de operadores GSM como T-Mobile, AT&T, MetroPCS, etc. No funcionará con operadores CDMA, como Verizon, Sprint, Boost.",4.5))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_a9,"Samsung Galaxy A9","$10,999.00","•Pantalla: 6.3 pulgadas (Super AMOLED)\n •Resolución: 2,160x1,080 pixeles\n•Procesador: Snapdragon 660\n•RAM: 6GB o 8GB\n•Almacenamiento: 128GB\n","•Pantalla: 6.3 pulgadas (Super AMOLED)\n •Resolución: 2,160x1,080 pixeles\n•Procesador: Snapdragon 660\n•RAM: 6GB o 8GB\n•Almacenamiento: 128GB\n•Ranura microSD: Sí, de hasta 512GB\n•Sistema operativo: Android Oreo\n Batería: 3,800mAh\n•Cámaras traseras: Cuatro cámaras, 8 megapixeles (gran angular 120 grados, f/2.4),telefoto de 10 megapixeles (f/2.4), regular de 24 megapixeles (f/1.7) y de profundidad para modo de retrato de 5 megapixeles (f/2.2)\n•Cámara frontal: 24 megapixeles",4.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_m31,"Samsung Galaxy M31","$7,999.00","•Cámara cuádruple versátil de 64MP para documentar todos tus momentos\n•Visualización inmersiva con pantalla Infinity-U de 16,21 cm (6,4)\n•Batería de 6,000 mAh y carga rápida de 15 W","•Cámara cuádruple versátil de 64MP para documentar todos tus momentos\n•Visualización inmersiva con pantalla Infinity-U de 16,21 cm (6,4)\n•Batería de 6,000 mAh y carga rápida de 15 W\n•Grabación de video con calidad 4K\n•Memoria RAM de 6 GB y procesador Exynos 9611 Octa 2.3 GHz + 1.7 GHz\n•Memoria externa expandible hasta 512 GB",4.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_note_10,"Samsung Galaxy Note 10","$15,399.00","•Pantalla: 6.3 pulgadas, primera pantalla de celular con certificación HDR+ (Dynamic OLED)\n•Resolución: 2,280x1,080 pixeles\n•Procesador: 2.84GHz Snapdragon 855 / 2.7GHz Exynos 9825, dependiendo del mercado\n•RAM: 8GB\n•Almacenamiento: 256GB (UFS 3.0)\n•Ranura microSD: Sí\n•Batería: 3,500mAh (no extraíble)\n •Sistema operativo: Android Pie (One UI)\n•Carga rápida: 25 vatios (25W) con cargador incluido","•Pantalla: 6.3 pulgadas, primera pantalla de celular con certificación HDR+ (Dynamic OLED)\n•Resolución: 2,280x1,080 pixeles\n•Procesador: 2.84GHz Snapdragon 855 / 2.7GHz Exynos 9825, dependiendo del mercado\n•RAM: 8GB\n•Almacenamiento: 256GB (UFS 3.0)\n•Ranura microSD: Sí\n•Batería: 3,500mAh (no extraíble)\n•Sistema operativo: Android Pie (One UI)\n•Carga rápida: 25 vatios (25W) con cargador incluido\n•Carga inalámbrica: Sí con PowerShare (carga reversible) y carga de hasta 12 vatios (12W)\n•Conectividad: Wi-Fi 6 (2.4 y 5GHz) MU-MIMO, Bluetooth 5.0\n•Samsung Pay: Sí, a través de NFC y MST\n•Funciones de desbloqueo: Lector de huellas en pantalla, reconocimiento facial, patrón, PIN, contraseña\n•Cámara trasera: Tres de 12 megapixeles (variable de f/1.5 y f/2.4) con estabilización óptica (80 grados); gran angular de 16 megapixeles (f/2.2 de 123 grados); telefoto de 12 megapixeles (f/2.1 de 45 grados) con estabilización óptica\n•Cámara frontal: 10 megapixeles (f/2.2)\n•Resistente al agua: IP68\n•Sonido: Doble bocina con Dolby Atmos\n•Conectividad: Hasta 7CA, LAA, LTE Cat.20\n•Tamaño: 151x71.8x7.9mm\n•Peso: 168 gramos",4.0))
        samsung.add(SamsungItem(R.drawable.samsung_galaxy_s20,"Samsung Galaxy S20","$15,699.00 ","•Pantalla QHD Always On Refresco 120 Hz\n •Procesador Exynos 990 octa-core 2.73GHz\n•8GB de RAM, 128 GB de almacenamiento interno","•Pantalla QHD Always On Refresco 120 Hz\n•Procesador Exynos 990 octa-core 2.73GHz\n•8GB de RAM, 128 GB de almacenamiento interno\n•Cámara Triple, 12 MP (f/1.8, PDAF Dual Pixel, OIS, wide) 64 MP (f/2.0, telefoto, OIS, PDAF) 12 MP (f/2.2, ultrawide, AF)\n•4000 mAh carga rápida, Android 10, Lector de huellas en pantalla Reconocimiento facial, Libre para cualquier compañia",4.5))

        return samsung


    }
}