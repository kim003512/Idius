package com.example.idiusdesign.data

import retrofit2.Call

interface BestSellRepository {

    // BestSelling 정보 리스트를 받아온다.
    fun getBestSell(): Call<List<BestSell>>
}