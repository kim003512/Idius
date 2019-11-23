package com.example.idiusdesign.ui
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.MdRecommend

class MdRecoAdapter(private val context: Context?): RecyclerView.Adapter<MdRecoViewHolder>(){
    var data: List<MdRecommend> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MdRecoViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_md_recommend, parent, false)
        return MdRecoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MdRecoViewHolder, position: Int) {
        holder.onBind(data[position])
    }

}