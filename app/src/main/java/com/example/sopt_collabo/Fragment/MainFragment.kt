package com.example.sopt_collabo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main.*
import me.relex.circleindicator.CircleIndicator2

class MainFragment : Fragment() {
    lateinit var ItemRecyclerViewAdapter1 : ItemRecyclerViewAdapter1
    lateinit var ItemRecyclerViewAdapter2 : ItemRecyclerViewAdapter2
    lateinit var ItemRecyclerViewAdapter3 : ItemRecyclerViewAdapter3

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setRecyclerView()

        showMore.setOnClickListener {
            ItemRecyclerViewAdapter2.data2List = ItemRecyclerViewAdapter2.data2List + ItemRecyclerViewAdapter2.data2List
            ItemRecyclerViewAdapter2.notifyDataSetChanged()
        }
    }


    private fun setRecyclerView(){
        //임시 데이터
        var dataList1 : ArrayList<HomeData> = ArrayList()
        dataList1.add(HomeData("http://m.zardins.com/web/product/big/201809/1a40a405cac4997c3a769e2f16bb0bbd.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "어텀브리즈","시루아네"))
        dataList1.add(HomeData("http://m.zardins.com/web/product/big/201809/1a40a405cac4997c3a769e2f16bb0bbd.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://carlisletheacarlisletheatre.org/images/white-star-png-rounded-7.jpg",
            "어텀브리즈","시루아네"))
        dataList1.add(HomeData("http://m.zardins.com/web/product/big/201809/1a40a405cac4997c3a769e2f16bb0bbd.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "어텀브리즈","시루아네"))
        dataList1.add(HomeData("http://m.zardins.com/web/product/big/201809/1a40a405cac4997c3a769e2f16bb0bbd.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "어텀브리즈","시루아네"))

        ItemRecyclerViewAdapter1 =
            ItemRecyclerViewAdapter1(activity!!, dataList1)
        rvItemRepo1.adapter = ItemRecyclerViewAdapter1
        rvItemRepo1.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)


        //임시 데이터
        var dataList2 : ArrayList<HomeData> = ArrayList()
        dataList2.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        dataList2.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        dataList2.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        dataList2.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        ItemRecyclerViewAdapter2 =
            ItemRecyclerViewAdapter2(activity!!, dataList2)
        rvItemRepo2.adapter = ItemRecyclerViewAdapter2
        rvItemRepo2.layoutManager = GridLayoutManager(activity, 2)


        var dataList3 : ArrayList<HomeData> = ArrayList()
        dataList3.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
        "파운드 케이크","시루아네"))
        dataList3.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        dataList3.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))
        dataList3.add(HomeData("https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/2019-02-14-16-12-37.jpg",
            "https://image.rocketpunch.com/company/1763/backpackr_logo_1557497487.png?s=400x400&t=inside",
            "https://img.freepik.com/free-vector/start_53876-25533.jpg?size=338&ext=jpg",
            "파운드 케이크","시루아네"))


        ItemRecyclerViewAdapter3 =
            ItemRecyclerViewAdapter3(activity!!, dataList3)
        rvItemRepo3.adapter = ItemRecyclerViewAdapter3
        rvItemRepo3.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        ItemRecyclerViewAdapter3.notifyDataSetChanged()

        // MdRecommmend 리사이클러뷰 Circle Indicator 설정
        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(rvItemRepo3)

        val rvMainMdReCoIndicator: CircleIndicator2 = view!!.findViewById(R.id.rvMainMdReCoIndicator)
        rvMainMdReCoIndicator.attachToRecyclerView(rvItemRepo3, pagerSnapHelper)

    }
}
