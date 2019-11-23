package com.example.idiusdesign.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.idiusdesign.R
import com.example.idiusdesign.data.GoldClassItemData
import kotlinx.android.synthetic.main.item_goldclass.view.*

class GoldClassAdapter(private val context : Context) : RecyclerView.Adapter<GoldClassViewHolder>() {

    var data = listOf<GoldClassItemData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoldClassViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_goldclass, parent, false)
        return GoldClassViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: GoldClassViewHolder, position: Int) {
        holder.bind(data[position])

        /** clickStar 함수 설명
         * --> 리사이클러뷰의 각 아이템마다 적용되는 좋아요 기능을 구현해야 한다!
         * --> onBindViewHolder 안에서 구현! 왜냐하면 매개변수로 가지고 있는 position에 의해 각 아이템마다 적용되는 함수이기 때문!
         * --> selector를 사용하여 좋아요 이미지를 바꿔주기 위해 이미지뷰의 isSelected 값을 true or false로 바꿔주었다.
         * --> isSelected가 true면 selector의 item중 selected 속성값이 true인 item을 보여준다.
         * --> isSelected가 false면 selector의 item중 selected 속성값이 false인 item을 보여준다.
         * */
        fun clickStar(){
            // isSelected가 false면 좋아요 안 눌린 상태, true면 좋아요 눌린 상태라고 하자.
            var isSelected : Boolean = false
            holder.itemView.iv_item_goldclass_star.setOnClickListener {
                if(isSelected == false){
                    holder.itemView.iv_item_goldclass_star.isSelected = true
                    isSelected = true
                }else{
                    holder.itemView.iv_item_goldclass_star.isSelected = false
                    isSelected = false
                }
            }
        }

        clickStar()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}