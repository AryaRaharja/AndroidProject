package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.adapter.LanguageAdapter
import com.example.androidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasa:RecyclerView = findViewById(R.id.rvBahasa)
        val data = arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Python",R.drawable.python),
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Python",R.drawable.python),
            Language("Golang",R.drawable.golang),
            Language("C++",R.drawable.cplus),
            Language("Python",R.drawable.python)

        )
        val adapter = LanguageAdapter(data)
        rvBahasa.adapter = adapter
        rvBahasa.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)
    }
}