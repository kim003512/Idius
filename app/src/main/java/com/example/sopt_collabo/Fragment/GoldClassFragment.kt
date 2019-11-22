package com.example.idiusdesign.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.data.GoldClassData
import com.example.sopt_collabo.R
import kotlinx.android.synthetic.main.fragment_goldclass.*

class GoldClassFragment : Fragment() {

    lateinit var goldClassRecyclerViewAdapter: GoldClassRecyclerViewAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goldclass, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        추후 서버 통신
        var datalist: ArrayList<GoldClassData> = ArrayList()
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://data.ac-illust.com/data/thumbnails/8a/8aeb7655323d3c9328d680ebdafc08c5_t.jpeg",
                "파운드케이크", "시루아네",
                "https://media.istockphoto.com/vectors/isolated-yellow-star-icon-ranking-mark-vector-id844559544"
            )
        )
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://data.ac-illust.com/data/thumbnails/8a/8aeb7655323d3c9328d680ebdafc08c5_t.jpeg",
                "달지않은 마카", "써니데이즈",
                "https://media.istockphoto.com/vectors/isolated-yellow-star-icon-ranking-mark-vector-id844559544"
            )
        )
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://data.ac-illust.com/data/thumbnails/8a/8aeb7655323d3c9328d680ebdafc08c5_t.jpeg",
                "막대 초콜렛", "포마스데이",
                "https://media.istockphoto.com/vectors/isolated-yellow-star-icon-ranking-mark-vector-id844559544"
            )
        )
        datalist.add(
            GoldClassData(
                "https://lh3.googleusercontent.com/p_sgJfxNPCXGBRCsgd6fn3ZNQeVi7YWXqObrH8Dac4UsJ3BxCa8mfqK2ivo7iwXzb8g",
                "https://data.ac-illust.com/data/thumbnails/8a/8aeb7655323d3c9328d680ebdafc08c5_t.jpeg",
                "천연재료 브라더", "오충마데",
                "https://media.istockphoto.com/vectors/isolated-yellow-star-icon-ranking-mark-vector-id844559544"
            )
        )
        goldClassRecyclerViewAdapter = GoldClassRecyclerViewAdapter(context!!, datalist)
        rv_goldclass_sungeun.adapter = goldClassRecyclerViewAdapter
        rv_goldclass_sungeun.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        // Use Grid Layout Manager
//        GridLayoutManager manager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(manager);
    }


}