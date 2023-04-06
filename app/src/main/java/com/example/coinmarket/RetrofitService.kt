package com.example.coinmarket

import retrofit2.Call
import retrofit2.http.GET

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-12-16
 * @desc
 */
interface RetrofitService {
    @GET("v2/assets")
    fun getTokenData() : Call<TokenModel>
}