package com.example.sopt_collabo.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sopt_collabo.MyFragmentStatePagerAdapter
import com.example.sopt_collabo.R
import kotlinx.android.synthetic.main.activity_bottom_navi.*

class BottomNaviActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navi)

        configureBottomNavigation()
    }

    private fun configureBottomNavigation(){
        vp_bottom_navi_act_frag_pager.adapter =
            MyFragmentStatePagerAdapter(supportFragmentManager, 4)

        //ViewPager에 TabLayout을 엮어줌
        tl_bottom_navi_act_bottom_menu.setupWithViewPager(vp_bottom_navi_act_frag_pager)

        //TabLayout에 붙일 layout을 찾아준 다음
        val bottomNaviLayout : View = this.layoutInflater.inflate(R.layout.bottom_navigation_tab, null, false)

        //탭 하나하나 TabLayout에 연결
        tl_bottom_navi_act_bottom_menu.getTabAt(0)!!.customView = bottomNaviLayout.findViewById(R.id.nav_image_1)
        tl_bottom_navi_act_bottom_menu.getTabAt(1)!!.customView = bottomNaviLayout.findViewById(R.id.nav_image_2)
        tl_bottom_navi_act_bottom_menu.getTabAt(2)!!.customView = bottomNaviLayout.findViewById(R.id.nav_image_3)
        tl_bottom_navi_act_bottom_menu.getTabAt(3)!!.customView = bottomNaviLayout.findViewById(R.id.nav_image_4)
    }
}
