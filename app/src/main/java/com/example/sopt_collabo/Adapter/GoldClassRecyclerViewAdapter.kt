package com.example.idiusdesign.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.idiusdesign.data.GoldClassData
import com.example.sopt_collabo.R

class GoldClassRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<GoldClassData>): RecyclerView.Adapter<GoldClassRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(
            R.layout.rv_item_sungeun, viewGroup, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].titleImg)
            .into(holder.titleImg)
        Glide.with(ctx)
            .load(dataList[position].profileImg)
            .into(holder.profileImg)
        Glide.with(ctx)
            .load(dataList[position].selectorImg)
            .into(holder.selectorImg)
        holder.titleName.text = dataList[position].titleName
        holder.profileName.text= dataList[position].profileName

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleImg = itemView.findViewById(R.id.iv_class_title) as ImageView
        var profileImg = itemView.findViewById(R.id.iv_class_profile) as ImageView
        var titleName = itemView.findViewById(R.id.tv_class_profile) as TextView
        var profileName = itemView.findViewById(R.id.tv_class_profile) as TextView
        var selectorImg = itemView.findViewById(R.id.iv_class_selector) as ImageView
    }
}
