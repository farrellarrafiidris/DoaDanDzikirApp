package com.farrell.doadandzikirapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farrell.doadandzikirapp.databinding.RowItemDzikirDoaBinding
import com.farrell.doadandzikirapp.model.DzikirDoaModel

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoaModel>) :
        RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>(){
    class MyViewHolder(val binding: RowItemDzikirDoaBinding):
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DzikirDoaAdapter.MyViewHolder {
        val bindingDzikirdoa = RowItemDzikirDoaBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(bindingDzikirdoa)
    }

    override fun onBindViewHolder(holder: DzikirDoaAdapter.MyViewHolder, position: Int) {
        val dataDzikirDoa = listDzikirDoa[position]

        holder.binding.apply {
            tvDesc.text = dataDzikirDoa.desc
            tvLafaz.text = dataDzikirDoa.lafaz
            tvTerjemah.text = dataDzikirDoa.terjemah
        }
    }

    override fun getItemCount(): Int = listDzikirDoa.size

}