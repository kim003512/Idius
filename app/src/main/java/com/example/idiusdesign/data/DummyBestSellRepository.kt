package com.example.idiusdesign.data


import retrofit2.Call
import retrofit2.mock.Calls

class DummyBestSellRepository: BestSellRepository{
    override fun getBestSell(): Call<List<BestSell>> {

        return Calls.response(
            listOf(
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = true,
                    intBestSell = null,
                    intBestSellStore = null

                ),
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = false,
                    intBestSell = null,
                    intBestSellStore = null
                )
                ,
                BestSell(
                    imgBestSellUrl = "",
                    imgBestSellStoreUrl  = "",
                    title = "어텀브리즈",
                    desc = "시루이네",
                    isStar = false,
                    intBestSell = null,
                    intBestSellStore = null
                )
            ) // listOf
        )
    }

}