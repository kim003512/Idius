package com.example.sopt_collabo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_collabo.Item1.ItemData1
import com.example.sopt_collabo.Item1.ItemRecyclerViewAdapter1
import com.example.sopt_collabo.Item2.ItemData2
import com.example.sopt_collabo.Item2.ItemRecyclerViewAdapter2
import com.example.sopt_collabo.Item3.ItemData3
import com.example.sopt_collabo.Item3.ItemRecyclerViewAdapter3
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
        var dataList1 : ArrayList<ItemData1> = ArrayList()
        dataList1.add(ItemData1(R.drawable.best_selling_pottery_img,R.drawable.profile_7,"어텀브리즈","시루아네"))
        dataList1.add(ItemData1(R.drawable.best_selling_pottery_img,R.drawable.profile_7,"어텀브리즈","시루아네"))
        dataList1.add(ItemData1(R.drawable.best_selling_pottery_img,R.drawable.profile_7,"어텀브리즈","시루아네"))
        dataList1.add(ItemData1(R.drawable.best_selling_pottery_img,R.drawable.profile_7,"어텀브리즈","시루아네"))

        ItemRecyclerViewAdapter1 = ItemRecyclerViewAdapter1(activity!!, dataList1)
        rvItemRepo1.adapter = ItemRecyclerViewAdapter1
        rvItemRepo1.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)


        //임시 데이터
        var data2List2 : ArrayList<ItemData2> = ArrayList()
//        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7,R.drawable.star_empty_icon, "파운드 케이크", "시루아네"))
//        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, R.drawable.star_empty_icon,"파운드 케이크", "써니데이즈"))
//        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, R.drawable.star_empty_icon,"파운드 케이크", "포마스데이"))
//        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, R.drawable.star_empty_icon,"파운드 케이크", "오층다방"))
        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, "파운드 케이크", "시루아네"))
        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, "파운드 케이크", "써니데이즈"))
        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, "파운드 케이크", "포마스데이"))
        data2List2.add(ItemData2(R.drawable.img_5, R.drawable.profile_7, "파운드 케이크", "오층다방"))
        ItemRecyclerViewAdapter2 =
            ItemRecyclerViewAdapter2(activity!!, data2List2)
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


        ItemRecyclerViewAdapter3 = ItemRecyclerViewAdapter3(activity!!, dataList3)
        rvItemRepo3.adapter = ItemRecyclerViewAdapter3
        rvItemRepo3.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        ItemRecyclerViewAdapter3.notifyDataSetChanged()
    }
}
