package com.example.sopt_collabo.Item1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_collabo.R

class ItemRecyclerViewAdapter1 (val ctx:Context, val data1List:ArrayList<ItemData1>) : RecyclerView.Adapter<ItemRecyclerViewAdapter1.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_item1,parent,false)

        return Holder(view)
    }

    override fun getItemCount(): Int = data1List.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(data1List[position].item_img)
            .into(holder.item_img1)
        Glide.with(ctx)
            .load(data1List[position].logo_img)
            .into(holder.logo_img1)
        holder.item_title1.text = data1List[position].item_title
        holder.store_title2.text = data1List[position].store_title

    }

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val item_img1 : ImageView = itemView.findViewById(R.id.rv_item1_item_img)
        val logo_img1 : ImageView = itemView.findViewById(R.id.rv_item1_logo_img)
        val item_title1 : TextView = itemView.findViewById(R.id.rv_item1_logo_item_title)
        val store_title2 : TextView = itemView.findViewById(R.id.rv_item1_store_title)
    }
}