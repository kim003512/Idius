package com.example.idiusdesign.ui

import android.view.View
import android.widget.CheckedTextView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.ForYou

public class ForYouViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val imgForYou: ImageView = view.findViewById(R.id.imgForYou)
    val imgForYouStore: ImageView = view.findViewById(R.id.imgForYouStore)
    val txtForYouTitle: TextView = view.findViewById(R.id.txtForYouTitle)
    val txtForYouDesc: TextView = view.findViewById(R.id.txtForYouDesc)
    val ckForYouStar: CheckedTextView= view.findViewById(R.id.ckForYouStar)


    fun onBind(foryou: ForYou){

        foryou.imgForYouInt?.let{
            imgForYou.setImageResource(it)
        }
        foryou.imgForYouStorInt?.let{
            imgForYouStore.setImageResource(it)
        }
        txtForYouTitle.text = foryou.title
        txtForYouDesc.text = foryou.desc

        ckForYouStar.setOnClickListener {
            ckForYouStar.toggle()
        }



    }

}