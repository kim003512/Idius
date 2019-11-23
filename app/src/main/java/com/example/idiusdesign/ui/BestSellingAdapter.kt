package com.example.idiusdesign.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.BestSell


class BestSellingAdapter(private val context: Context?) : RecyclerView.Adapter<BestSellingViewHolder>(){
    var data: List<BestSell> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellingViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.item_best_selling,parent, false)
        return BestSellingViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    // 만들어진 ViewHolder에 데이터를 연결한다.
    override fun onBindViewHolder(holder: BestSellingViewHolder, position: Int) {
        holder.onBind(data[position])
    }

}