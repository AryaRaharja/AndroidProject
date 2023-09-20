package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Kisabe","Zyad","Syahdan","Bimo"
        )
        var mListView: ListView = findViewById(R.id.listNama)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,users)
        mListView.adapter = arrayAdapter
    }
}