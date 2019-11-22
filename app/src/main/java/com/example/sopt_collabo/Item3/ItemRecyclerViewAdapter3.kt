package com.example.sopt_collabo.Item3

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_collabo.HomeData
import com.example.sopt_collabo.R

class ItemRecyclerViewAdapter3(val ctx: Context, val dataList3:ArrayList<HomeData>):RecyclerView.Adapter<ItemRecyclerViewAdapter3.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_item2, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int = dataList3.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList3[position].item_img)
            .into(holder.item_img3)
        Glide.with(ctx)
            .load(dataList3[position].logo_img)
            .into(holder.logo_img3)
        Glide.with(ctx)
            .load(dataList3[position].selector)
            .into(holder.selector3)
        holder.item_title3.text = dataList3[position].item_title
        holder.store_title3.text = dataList3[position].store_title

        Log.e("TAG",dataList3[position].item_title)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val item_img3 : ImageView = itemView.findViewById(R.id.rv_item2_item_img)
        val logo_img3 : ImageView = itemView.findViewById(R.id.rv_item2_logo_img)
        val selector3 : ImageView = itemView.findViewById(R.id.rv_item2_selector)
        val item_title3 : TextView = itemView.findViewById(R.id.rv_item2_logo_item_title)
        val store_title3 : TextView = itemView.findViewById(R.id.rv_item2_store_title)
    }
}