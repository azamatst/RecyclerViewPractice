package com.example.practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.practice1.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            replaceFragment(FirstFragment())
        }
        val data : Animal = arguments?.getSerializable("key") as Animal
        binding.tvTextName.text = data.name
        binding.tvSongNameDetail.text = data.songName
        binding.tvTextAge.text = data.time
        Glide.with(binding.itemSongImageDetail).load(data.imageMusic).into(binding.itemSongImageDetail)
    }
}