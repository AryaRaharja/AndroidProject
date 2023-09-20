package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber:TextView = findViewById(R.id.tvNumber)
        val btnCount:Button = findViewById(R.id.btnCount)
        val btnCount2:Button = findViewById(R.id.btnCount2)
        val btnCount3:Button = findViewById(R.id.btnCount3)


        tvNumber.text = "100"

        println(tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text}")

        btnCount2.setOnClickListener {

            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text = countInteger.toString()
        }
        btnCount.setOnClickListener {
            tvNumber.text = "0"
        }
        btnCount3.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger--
            tvNumber.text = countInteger.toString()
        }
    }
}