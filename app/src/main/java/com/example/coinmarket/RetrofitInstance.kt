package com.example.coinmarket

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-12-16
 * @desc
 */
object RetrofitInstance {
    private const val BASE_URL = "https://api.coincap.io/"
    private var INSTANCE : Retrofit?= null

    fun getInstance() : Retrofit {
        if (INSTANCE == null) {
            INSTANCE = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        }
        return INSTANCE!!
    }
}