package com.example.sopt_collabo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyFragmentStatePagerAdapter(fm:FragmentManager, val fragmentCount:Int): FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return MainFragment()
            1 -> return ClassFragment()
            2 -> return MainFragment()
            3 -> return MainFragment()
            else -> throw IllegalArgumentException("해당 인덱스에 프래그먼트가 없습니다.")
        }
    }

    override fun getCount(): Int = fragmentCount
}