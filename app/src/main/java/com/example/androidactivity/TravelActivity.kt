package com.example.androidactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibRoute : ImageButton? = null
    var ibShare : ImageButton? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibRoute = findViewById(R.id.ibRoute)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener {
            val phoneNumber = "085217820272"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }

        ibRoute!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-6.583068215325275, 106.76766066539089"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        ibShare!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Selamat Datang Di SMK PESAT")
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to : "))
        }

    }
}