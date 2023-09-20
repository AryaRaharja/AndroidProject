package com.example.androidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.R
import com.example.androidactivity.model.Doa
import com.example.androidactivity.model.DoaHarian
import com.example.androidactivity.model.Language

class DoaAdapter (val data:ArrayList<Doa>)
    :RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {
    class DoaViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val tvDoa22: TextView = view.findViewById(R.id.tvDoa33)
        val ivDoa33: ImageView = view.findViewById(R.id.ivDoa22)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaAdapter.DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_dzikir, parent, false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size


    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvDoa22.text = item.name
        holder.ivDoa33.setImageResource(item.Image)
    }
}