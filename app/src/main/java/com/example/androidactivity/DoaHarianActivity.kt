package com.example.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.adapter.DoaAdapter
import com.example.androidactivity.adapter.DoaHarianAdapter
import com.example.androidactivity.model.Doa
import com.example.androidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvDoah: RecyclerView = findViewById(R.id.rvDoah)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ","Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            DoaHarian("Doa Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ","Bismikallohumma ahya wa amuutu"),
            DoaHarian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Ketika Bercermin","اَلْحَمْدُ ِللهِ كَمَا حَسَّنْتَ خَلْقِىْ  فَحَسِّـنْ خُلُقِىْ","Alhamdulillaahi kamaa hassanta kholqii fahassin khuluqii"),
            DoaHarian("Doa Masuk Masjid","اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَ","Allahummaf tahlii abwaaba rohmatik"),
            DoaHarian("Doa Istinja","اَللّٰهُمَّ حَسِّنْ فَرْجِىْ مِنَ الْفَوَاخِشِ وَظَهِّرْ قَلْبِيْ مِنَ النِّفَاقِ","Alloohumma thahhir qolbii minan nifaaqi wa hashshin fajrii minal fawaahisyi")

        )
        val adapter = DoaHarianAdapter(data)
        rvDoah.adapter = adapter
        rvDoah.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

    }
}