package com.example.practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.practice1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding
    private var animalList = ArrayList<Animal>()
    private var fragment: DetailFragment = DetailFragment()
    private var adapter = AnimalAdapter(animalList, this::onItemClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.title = "Любимые треки "
        loadData()
        binding.recycler.adapter = adapter
    }

    private fun loadData() {
        animalList.add(
            Animal(
                "Mario",
                "Let Me Love You",
                "4:11",
                "https://avatars.yandex.net/get-music-content/2383988/1cf8ab6b.a.9691367-2/400x400"
            )
        )
        animalList.add(
            Animal(
                "50 cent",
                "How We Do",
                "3:55",
                "https://avatars.yandex.net/get-music-content/42108/10510516.a.4205-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Major Lazer",
                "Light it up",
                "4:20",
                "https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Tonight",
                "Jay Sean",
                "3:30",
                "https://avatars.yandex.net/get-music-content/108289/c7071da5.a.6319414-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Superman",
                "Eminem",
                "4:02",
                "https://avatars.yandex.net/get-music-content/34131/436d3796.a.59523-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Hips Don't Lie",
                "Shakira",
                "3:55",
                "https://avatars.yandex.net/get-music-content/33216/077459dc.a.67292-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Wake Up in the Sky",
                "Bruno Mars",
                "3:20",
                "https://avatars.yandex.net/get-music-content/2433207/2856015d.a.12864225-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Praise The Lord (Da Shine)",
                "ASAP Rocky, Skepta",
                "3:40",
                "https://avatars.yandex.net/get-music-content/99892/100b3f0b.a.5400781-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Cheap Thrills",
                "Sia",
                "3:04",
                "https://avatars.yandex.net/get-music-content/33216/98a90c87.a.3837950-1/400x400"
            )
        )
        animalList.add(
            Animal(
                "Seven Nation Army",
                "The White Stripes",
                "2:30",
                "https://avatars.yandex.net/get-music-content/6201394/d43c8863.a.11644078-3/400x400"
            )
        )
        animalList.add(
            Animal(
                "Mario",
                "Let Me Love You",
                "4:11",
                "https://avatars.yandex.net/get-music-content/2383988/1cf8ab6b.a.9691367-2/400x400"
            )
        )
        animalList.add(
            Animal(
                "Major Lazer",
                "Light it up",
                "4:20",
                "https://avatars.yandex.net/get-music-content/113160/1be2afbc.a.6840009-1/400x400"
            )
        )

//        adapter = AnimalAdapter(data = data) {
//            showToast(adapter.getAnimal(it).toString())
//        }
    }

    private fun onItemClick(position: Int) {
        val bundle = Bundle()
        bundle.putSerializable("key", animalList[position])
        fragment.arguments = bundle
        replaceFragment(fragment)
    }
}