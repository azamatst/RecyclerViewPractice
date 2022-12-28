package com.example.practice1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practice1.databinding.ItemAnimalBinding
import java.util.ArrayList

class AnimalAdapter(private val data:ArrayList<Animal>, private val onClick: (pos: Int) -> Unit):
    RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        return AnimalViewHolder(ItemAnimalBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(getAnimal(position))
    }

    override fun getItemCount(): Int = data.size

     fun getAnimal(position: Int): Animal = data[position]


    inner class AnimalViewHolder(private val binding: ItemAnimalBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(animal: Animal) {
            binding.name.text = animal.name
            binding.tvSongName.text = animal.songName
            binding.age.text = getAnimal(adapterPosition).time
            binding.root.setOnClickListener {
                onClick(adapterPosition)
            }

            Glide.with(binding.itemSongImage).load(animal.imageMusic).into(binding.itemSongImage)
        }
    }
}