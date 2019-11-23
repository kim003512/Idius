package com.example.idiusdesign.ui




import android.app.ActionBar


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.*
import kotlinx.android.synthetic.main.fragment_main.*
import me.relex.circleindicator.CircleIndicator2


class MainFragment : Fragment() {
    private lateinit var bestSelladapter: BestSellingAdapter
    private lateinit var forYouAdapter: ForYouAdapter
    private lateinit var mdRecoAdpater: MdRecoAdapter

    private val bestSellRepository: BestSellRepository = DummyBestSellRepository()
    private lateinit var rvMainBestSelling: RecyclerView
    private lateinit var rvMainForYou: RecyclerView
    private lateinit var rvMainMdRecommend: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_main, container, false)
        return view
    }
//more 늘리기
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//    setRecyclerView()
//
//    btnMainMore.setOnClickListener {
//        ItemRecyclerViewAdapter2.data2List = ItemRecyclerViewAdapter2.data2List + ItemRecyclerViewAdapter2.data2List
//        ItemRecyclerViewAdapter2.notifyDataSetChanged()
//    }
//    }



    // Activity 의 onCreate 호출이 종료된 후 실행된다.
    // activity에 접근해서 작업을 하려면 이 생명주기 함수에서 해야한다.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var actionBar: ActionBar? = activity?.actionBar
        actionBar?.setTitle("")
        actionBar?.setIcon(R.drawable.logo)
        // 이 두 함수까지 사용해야 App Bar 에 아이콘이 정상적으로 표신된다.
        actionBar?.setDisplayUseLogoEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        btnMainMore.setOnClickListener {
            forYouAdapter.data = forYouAdapter.data + forYouAdapter.data
            forYouAdapter.notifyDataSetChanged()
        }


        view?.let { view ->
            // 리사이클러뷰 어댑터 생성
            bestSelladapter = BestSellingAdapter(activity?.baseContext)
            forYouAdapter = ForYouAdapter(activity?.baseContext)
            mdRecoAdpater = MdRecoAdapter(activity?.baseContext)

            // 리사이클러뷰 생성
            rvMainBestSelling = view.findViewById(R.id.rvMainBestSelling)
            rvMainForYou = view.findViewById(R.id.rvMainForyou)
            rvMainMdRecommend = view.findViewById(R.id.rvMainMdReCommand)

            // 리사이클러뷰 레이아웃매니저 설정
            rvMainBestSelling.layoutManager = LinearLayoutManager(activity?.baseContext, LinearLayoutManager.HORIZONTAL, false)
            rvMainForYou.layoutManager = GridLayoutManager(activity?.baseContext, 2)
            rvMainMdRecommend.layoutManager = LinearLayoutManager(activity?.baseContext, LinearLayoutManager.HORIZONTAL, false)

            // 리사이클러뷰 어댑터 설정
            rvMainBestSelling.adapter = bestSelladapter
            rvMainForYou.adapter = forYouAdapter
            rvMainMdRecommend.adapter = mdRecoAdpater

            // MdRecommmend 리사이클러뷰 Circle Indicator 설정
            val pagerSnapHelper = PagerSnapHelper()
            pagerSnapHelper.attachToRecyclerView(rvMainMdRecommend)

            val rvMainMdReCoIndicator: CircleIndicator2 = view.findViewById(R.id.rvMainMdReCoIndicator)
            rvMainMdReCoIndicator.attachToRecyclerView(rvMainMdRecommend, pagerSnapHelper)

            // indicator와 리사이클러뷰 연결
            mdRecoAdpater.registerAdapterDataObserver(rvMainMdReCoIndicator.adapterDataObserver)

            // 리사이클러뷰 데이터 설정
            bestSelladapter.data = listOf(
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = true,
                    intBestSell = R.drawable.best_selling_pottery_img,
                    intBestSellStore = R.drawable.profile_5

                ),
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = false,
                    intBestSell = R.drawable.best_selling_pottery_img,
                    intBestSellStore = R.drawable.profile_5
                )
                ,
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = false,
                    intBestSell = R.drawable.best_selling_shoes_img,
                    intBestSellStore = R.drawable.profile_5
                )
            ) // listOf

            forYouAdapter.data = listOf(
                ForYou(
                    imgForYouUrl = "",
                    imgForYouStoreUrl = "",
                    isStar = false,
                    title = "파운드케이크",
                    desc = "시루아네",
                    imgForYouInt = R.drawable.img_5,
                    imgForYouStorInt = R.drawable.profile_5
                ),
                ForYou(
                    imgForYouUrl = "",
                    imgForYouStoreUrl = "",
                    isStar = false,
                    title = "달지않은",
                    desc = "써니데이즈",
                    imgForYouInt = R.drawable.img_6,
                    imgForYouStorInt = R.drawable.profile_6
                ),
                ForYou(
                    imgForYouUrl = "",
                    imgForYouStoreUrl = "",
                    isStar = false,
                    title = "막대 초콜렛",
                    desc = "포마스데이",
                    imgForYouInt = R.drawable.img_6,
                    imgForYouStorInt = R.drawable.profile_5
                ),
                ForYou(
                    imgForYouUrl = "",
                    imgForYouStoreUrl = "",
                    isStar = false,
                    title = "천연재료 브래드",
                    desc = "오층다방",
                    imgForYouInt = R.drawable.img_6,
                    imgForYouStorInt = R.drawable.profile_5
                )


            )// end listOf

            mdRecoAdpater.data = listOf(
                MdRecommend(
                    imgRightMdRecoUrl = "",
                    imgRightMdRecoStorURl = "",
                    txtRightMdRecoTitle = "막대 초콜릿",
                    txtRightMdRecoDesc = "포마스데이",
                    imgRightMdRecoInt = R.drawable.img_1,
                    imgRightMdRecoStoreInt = R.drawable.profile_5,
                    isRightStar = false,

                    imgLeftMdRecoUrl = "",
                    imgLeftMdRecoStorURl = "",
                    txtLeftMdRecoTitle = "천연재료 브래드",
                    txtLeftMdRecoDesc = "오층다방",
                    imgLeftMdRecoInt = R.drawable.img_1,
                    imgLeftMdRecoStoreInt = R.drawable.profile_5,
                    isLeftStar = false

                ),
                MdRecommend(
                    imgRightMdRecoUrl = "",
                    imgRightMdRecoStorURl = "",
                    txtRightMdRecoTitle = "막대 초콜릿",
                    txtRightMdRecoDesc = "포마스데이",
                    imgRightMdRecoInt = R.drawable.img_1,
                    imgRightMdRecoStoreInt = R.drawable.profile_5,
                    isRightStar = false,

                    imgLeftMdRecoUrl = "",
                    imgLeftMdRecoStorURl = "",
                    txtLeftMdRecoTitle = "천연재료 브래드",
                    txtLeftMdRecoDesc = "오층다방",
                    imgLeftMdRecoInt = R.drawable.img_1,
                    imgLeftMdRecoStoreInt = R.drawable.profile_5,
                    isLeftStar = false
                ),
                MdRecommend(
                    imgRightMdRecoUrl = "",
                    imgRightMdRecoStorURl = "",
                    txtRightMdRecoTitle = "막대 초콜릿",
                    txtRightMdRecoDesc = "포마스데이",
                    imgRightMdRecoInt = R.drawable.img_1,
                    imgRightMdRecoStoreInt = R.drawable.profile_5,
                    isRightStar = false,

                    imgLeftMdRecoUrl = "",
                    imgLeftMdRecoStorURl = "",
                    txtLeftMdRecoTitle = "천연재료 브래드",
                    txtLeftMdRecoDesc = "오층다방",
                    imgLeftMdRecoInt = R.drawable.img_1,
                    imgLeftMdRecoStoreInt = R.drawable.profile_5,
                    isLeftStar = false
                ),
                MdRecommend(
                    imgRightMdRecoUrl = "",
                    imgRightMdRecoStorURl = "",
                    txtRightMdRecoTitle = "막대 초콜릿",
                    txtRightMdRecoDesc = "포마스데이",
                    imgRightMdRecoInt = R.drawable.img_1,
                    imgRightMdRecoStoreInt = R.drawable.profile_5,
                    isRightStar = false,

                    imgLeftMdRecoUrl = "",
                    imgLeftMdRecoStorURl = "",
                    txtLeftMdRecoTitle = "천연재료 브래드",
                    txtLeftMdRecoDesc = "오층다방",
                    imgLeftMdRecoInt = R.drawable.img_1,
                    imgLeftMdRecoStoreInt = R.drawable.profile_5,
                    isLeftStar = false
                )



            ) // end listOf()
            bestSelladapter.notifyDataSetChanged()
            forYouAdapter.notifyDataSetChanged()
            mdRecoAdpater.notifyDataSetChanged()





        }
    }


} // end class
