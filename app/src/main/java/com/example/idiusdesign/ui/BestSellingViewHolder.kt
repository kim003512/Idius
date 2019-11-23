package com.example.idiusdesign.ui

import android.view.View
import android.widget.CheckedTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.BestSell

class BestSellingViewHolder(view: View): RecyclerView.ViewHolder(view){
    val imgBestSell: ImageView = view.findViewById(R.id.imgBestSell)
    val imgBestSellStore: ImageView = view.findViewById(R.id.imgBestSellStore)
    val ckBestSellStar: CheckedTextView= view.findViewById(R.id.ckBestSellStar)
    val txtBestSellTitle: TextView = view.findViewById(R.id.txtBestSellTitle)
    val txtBestSellDesc: TextView = view.findViewById(R.id.txtBestSellDesc)

    fun onBind(bestSell: BestSell){
        txtBestSellTitle.text = bestSell.title
        txtBestSellDesc.text = bestSell.desc

        bestSell.intBestSell?.let {
            imgBestSell.setImageResource(it)
        }

        bestSell.intBestSellStore?.let {
            imgBestSellStore.setImageResource(it)
        }
        // 아이템을 클릭하면 별표 버튼의 이미지가 바뀜
        if(bestSell.isStar){
            ckBestSellStar.setCheckMarkDrawable(R.drawable.star_icon)
        }
        ckBestSellStar.setOnClickListener { ckBestSellStar.toggle() }

    }
}