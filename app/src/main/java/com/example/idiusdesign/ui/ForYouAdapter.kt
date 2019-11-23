package com.example.idiusdesign.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.ForYou

public class ForYouAdapter(private val context: Context?) : RecyclerView.Adapter<ForYouViewHolder>(){
    var data :List<ForYou> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForYouViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_for_you, parent, false)
        return ForYouViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ForYouViewHolder, position: Int) {
        return holder.onBind(data[position])
    }

}