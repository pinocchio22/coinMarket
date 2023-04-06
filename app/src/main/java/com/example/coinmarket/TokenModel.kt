package com.example.coinmarket

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-12-16
 * @desc
 */
data class TokenModel(var data : List<Data>) {
    data class Data( var symbol: String, var priceUsd: Double,)
}