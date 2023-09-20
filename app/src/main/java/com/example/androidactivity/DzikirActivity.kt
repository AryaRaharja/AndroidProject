package com.example.androidactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.adapter.DoaAdapter
import com.example.androidactivity.model.Doa

class DzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir)
        val listDoa: RecyclerView = findViewById(R.id.listDoa)
        val data = arrayListOf<Doa>(
            Doa("Orang Berdoa",R.drawable.doaaaa),
            Doa("Orang Berdoa",R.drawable.doaaaa),
            Doa("Orang Berdoa",R.drawable.doaaaa),
            Doa("Orang Berdoa",R.drawable.doaaaa),
            Doa("Orang Berdoa",R.drawable.doaaaa),
            Doa("Orang Berdoa",R.drawable.doaaaa)
        )
        val adapter = DoaAdapter(data)
        listDoa.adapter = adapter
        listDoa.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
    }
}