package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val kisabeGacor:TextView = findViewById(R.id.kisabeGacor)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val inputNama:EditText = findViewById(R.id.inputNama)
        val labelBank:TextView = findViewById(R.id.labelBank)
        val inputBank:EditText = findViewById(R.id.inputBank)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val tampilkanNama: TextView = findViewById(R.id.tampilkanNama)
        val tampilkanBank: TextView = findViewById(R.id.tampilkanBank)

        kisabeGacor.text= "Kisabe Gacor"

        btnSubmit.setOnClickListener {
            Toast.makeText(this,"Ayo Bermain ${inputNama.text}",Toast.LENGTH_SHORT
            ).show()
            tampilkanNama.text=inputNama.text
            tampilkanBank.text=inputBank.text
        }
    }
}