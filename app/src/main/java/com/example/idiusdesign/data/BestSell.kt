package com.example.idiusdesign.data

data class BestSell(
    val imgBestSellUrl: String, // 상품 사진
    val imgBestSellStoreUrl: String, // 가게 사진
    val title: String,
    val desc: String,
    val isStar: Boolean, // 별 표시 여부
    val intBestSell: Int?,
    val intBestSellStore: Int?
)