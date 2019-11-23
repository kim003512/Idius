package com.example.idiusdesign.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.idiusdesign.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    var fragment1: MainFragment? = null
    var fragment2: GoldClassFragment? = null
    var fragment3: SearchFragment? = null
    var fragment4: MypageFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragment1 = MainFragment()
        fragment2 = GoldClassFragment()
        fragment3 = SearchFragment()
        fragment4 = MypageFragment()

        supportFragmentManager.beginTransaction().replace(R.id.container, fragment1!!).commit()

        val bottomNavigation =
            findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.tab1 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "첫 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment1!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab2 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "두 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment2!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab3 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "세 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment3!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.tab4 -> {
//                        Toast.makeText(
//                            applicationContext,
//                            "세 번째 탭 선택됨.",
//                            Toast.LENGTH_LONG
//                        ).show()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.container, fragment4!!).commit()
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            }
        )
    }
}


//        configureMainTab()


//    private fun configureMainTab(){
//        vp_class_list.adapter = MainPageAdapter(supportFragmentManager,4)
//        vp_class_list.offscreenPageLimit = 4
//        tl_bottom_tabbar.setupWithViewPager(vp_class_list)
//
//        val navCategoryMainLayout: View = (this.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
//                as LayoutInflater)
//            .inflate(R.layout.fragment_main_bottom_tabbar, null, false)
//        tl_bottom_tabbar.getTabAt(0)!!.customView = navCategoryMainLayout.
//            findViewById(R.id.ll_main_home_tab) as LinearLayout
//        tl_bottom_tabbar.getTabAt(1)!!.customView = navCategoryMainLayout.
//            findViewById(R.id.ll_main_class_tab) as LinearLayout
//        tl_bottom_tabbar.getTabAt(2)!!.customView = navCategoryMainLayout.
//            findViewById(R.id.ll_main_search_tab) as LinearLayout
//        tl_bottom_tabbar.getTabAt(3)!!.customView = navCategoryMainLayout.
//            findViewById(R.id.ll_main_mypage_tab) as LinearLayout
//
//    }


