package com.example.idiusdesign.data

data class MdRecommend(
    val imgRightMdRecoUrl: String,
    val imgRightMdRecoStorURl: String,
    val isRightStar: Boolean,
    val txtRightMdRecoTitle: String,
    val txtRightMdRecoDesc: String,
    val imgRightMdRecoInt: Int?,
    val imgRightMdRecoStoreInt: Int?,


    val imgLeftMdRecoUrl: String,
    val imgLeftMdRecoStorURl: String,
    val isLeftStar: Boolean,
    val txtLeftMdRecoTitle: String,
    val txtLeftMdRecoDesc: String,
    val imgLeftMdRecoInt: Int?,
    val imgLeftMdRecoStoreInt: Int?


)