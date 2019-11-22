package com.example.sopt_collabo.Item2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt_collabo.R

class ItemRecyclerViewAdapter2(val ctx:Context, var data2List:List<ItemData2>):RecyclerView.Adapter<ItemRecyclerViewAdapter2.Holder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_item2,parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int = data2List.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(data2List[position].item_img)
            .into(holder.item_img2)
        Glide.with(ctx)
            .load(data2List[position].logo_img)
            .into(holder.logo_img2)
//        Glide.with(ctx)
//            .load(data2List[position].selector)
//            .into(holder.selector2)
        holder.item_title2.text = data2List[position].item_title
        holder.store_title2.text = data2List[position].store_title
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val ctnRvItem : View = itemView.findViewById(R.id.ctnRvItem)
        val item_img2 : ImageView = itemView.findViewById(R.id.rv_item2_item_img)
        val logo_img2 : ImageView = itemView.findViewById(R.id.rv_item2_logo_img)
        val selector2 : ImageView = itemView.findViewById(R.id.rv_item2_selector)
        val item_title2 : TextView = itemView.findViewById(R.id.rv_item2_logo_item_title)
        val store_title2 : TextView = itemView.findViewById(R.id.rv_item2_store_title)
    }
}