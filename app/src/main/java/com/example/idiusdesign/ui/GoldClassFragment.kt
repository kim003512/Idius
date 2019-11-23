package com.example.idiusdesign.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.GoldClassData
import com.example.idiusdesign.data.GoldClassItemData
import kotlinx.android.synthetic.main.fragment_goldclass.*

class GoldClassFragment : Fragment() {

    lateinit var goldClassRecyclerViewAdapter: GoldClassRecyclerViewAdapter

    private lateinit var rvLikeGoldClass: RecyclerView
    private lateinit var rvNewGoldClass: RecyclerView
    private lateinit var rvLikeGoldClassAdapter: GoldClassAdapter
    private lateinit var rvNewGoldClassAdapter: GoldClassAdapter


    override fun  onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_goldclass, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        view?.let { view ->

            rvLikeGoldClass = view.findViewById(R.id.rv_like_goldclass)
            rvNewGoldClass = view.findViewById(R.id.rv_new_goldclass)

            rvLikeGoldClassAdapter = GoldClassAdapter(context!!)
            rvNewGoldClassAdapter = GoldClassAdapter(context!!)

            rvLikeGoldClass.adapter = rvLikeGoldClassAdapter
            rvNewGoldClass.adapter = rvNewGoldClassAdapter

            rvLikeGoldClass.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            rvNewGoldClass.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

            rvLikeGoldClassAdapter.data = listOf(
                GoldClassItemData(
                    ivThumbnail = R.drawable.img_1,
                    ivProfile = R.drawable.profile_5,
                    tvTitle = "통통 다쿠아즈 만들기",
                    tvStore = "메르시오브"
                ),
                GoldClassItemData(
                    ivThumbnail = R.drawable.img_2,
                    ivProfile = R.drawable.profile_5,
                    tvTitle = "레터링케이크",
                    tvStore = "메르시오브"
                )
            )
            rvNewGoldClassAdapter.data = listOf(
                GoldClassItemData(
                    ivThumbnail = R.drawable.img_3,
                    ivProfile = R.drawable.profile_5,
                    tvTitle = "꾸덕,쫀득 마카롱 원데이",
                    tvStore = "해블랑디저트"
                ),
                GoldClassItemData(
                    ivThumbnail = R.drawable.img_4,
                    ivProfile = R.drawable.profile_5,
                    tvTitle = "까눌레클래스",
                    tvStore = "다앤하"
                )
            )

            rvNewGoldClassAdapter.notifyDataSetChanged()
            rvLikeGoldClassAdapter.notifyDataSetChanged()
        }

//        추후 서버 통신
        var datalist: ArrayList<GoldClassData> = ArrayList()
        datalist.add(
            GoldClassData(
                titleImg = R.drawable.img_5,
                profileImg = R.drawable.profile_5,
                titleName = "파운드케이크",
                profileName = "시루아네"
//                "R.drawable.img_5","R.drawable.profile_5","파운드케이크", "시루아네"
            )
        )
        datalist.add(
            GoldClassData(
                titleImg = R.drawable.img_6,
                profileImg = R.drawable.profile_6,
                titleName = "달지않은 마카롱",
                profileName = "써니데이즈"
//                "R.drawable.img_5","R.drawable.profile_5","파운드케이크", "시루아네"
            )
        )
        datalist.add(
            GoldClassData(
                titleImg = R.drawable.img_7,
                profileImg = R.drawable.profile_7,
                titleName = "막대 초콜렛",
                profileName = "포마스데"
//                "R.drawable.img_5","R.drawable.profile_5","파운드케이크", "시루아네"
            )
        )
        datalist.add(
            GoldClassData(
                titleImg = R.drawable.img_8,
                profileImg = R.drawable.profile_8,
                titleName = "천연재료 브레드",
                profileName = "오층다방"
//                "R.drawable.img_5","R.drawable.profile_5","파운드케이크", "시루아네"
            )
        )
        goldClassRecyclerViewAdapter = GoldClassRecyclerViewAdapter(context!!, datalist)
        rv_goldclass_sungeun.adapter = goldClassRecyclerViewAdapter
        rv_goldclass_sungeun.layoutManager =
            GridLayoutManager(context, 2)
        // Use Grid Layout Manager
//        GridLayoutManager manager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(manager);
    }

}
