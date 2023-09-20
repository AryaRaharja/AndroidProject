package com.example.androidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.R
import com.example.androidactivity.model.Language

class LanguageAdapter (val data:ArrayList<Language>)
    :RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {
    class LanguageViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val tvText: TextView = view.findViewById(R.id.tvText)
        val ivBahasa: ImageView = view.findViewById(R.id.ivBahasa)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman2, parent, false)
        return LanguageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvText.text = item.name
        holder.ivBahasa.setImageResource(item.Image)
    }
}