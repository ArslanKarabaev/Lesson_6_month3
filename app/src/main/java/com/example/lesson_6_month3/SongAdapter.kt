package com.example.lesson_6_month3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.lesson_6_month3.databinding.ItemSongBinding

class SongAdapter(
    val list: ArrayList<SongModel>,
    val onClick:(position: Int)-> Unit
):Adapter<SongAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding:ItemSongBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){
            val songModel = list[adapterPosition]
            binding.apply {
                songModel.apply {
                    tvSongName.text = name
                    tvAuthor.text = author
                    tvCounter.text = counter.toString()
                }
            }

            itemView.setOnClickListener{
                onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}

