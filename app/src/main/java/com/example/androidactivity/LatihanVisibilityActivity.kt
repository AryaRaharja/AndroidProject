package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvTextt: TextView = findViewById(R.id.tvTextt)
        val btnClick: Button = findViewById(R.id.btnClick)

        btnClick.setOnClickListener {
            if (tvTextt.visibility == View.VISIBLE)
                tvTextt.visibility = View.INVISIBLE
            else{
                tvTextt.visibility = View.VISIBLE
            }
        }
    }
}