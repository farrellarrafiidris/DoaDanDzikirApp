package com.farrell.doadandzikirapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farrell.doadandzikirapp.databinding.FragmentArtikelBinding
import com.farrell.doadandzikirapp.model.ArtikelModel
import com.farrell.doadandzikirapp.ui.detail.DetailArtikelActivity

class ArtikelAdapter (private val listArtikel: ArrayList<ArtikelModel>) :
        RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: FragmentArtikelBinding): RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtikelAdapter.MyViewHolder {
        val binding = FragmentArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = listArtikel.size

    override fun onBindViewHolder(holder: ArtikelAdapter.MyViewHolder, position: Int) {
        val data = listArtikel[position]

        Glide.with(holder.itemView.context)
            .load(data.imagesAtikel)
            .into(holder.binding.imgFragment)

        holder.binding.imgFragment.setOnClickListener{
            val intentDetail = Intent(holder.itemView.context, DetailArtikelActivity::class.java)
            intentDetail.putExtra(DetailArtikelActivity.DETAIL_DESC, data.descArtikel)
            intentDetail.putExtra(DetailArtikelActivity.DETAIL_TITLE, data.titleAtikel)
            intentDetail.putExtra(DetailArtikelActivity.DETAIL_IMAGE, data.imagesAtikel)
            holder.itemView.context.startActivity(intentDetail)
        }

    }
}