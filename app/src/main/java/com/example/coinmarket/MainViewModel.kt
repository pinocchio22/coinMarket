package com.example.coinmarket

import android.media.session.MediaSession.Callback
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call

/**
 * @author CHOI
 * @email vviian.2@gmail.com
 * @created 2021-12-16
 * @desc
 */
class MainViewModel: ViewModel() {
    private var mutableText = MutableLiveData<String>()
    val liveText : LiveData<String>
        get() = mutableText

    fun getToken() {
        val api = RetrofitInstance.getInstance().create(RetrofitService::class.java)
        api.getTokenData().enqueue(object : retrofit2.Callback<TokenModel> {
            override fun onResponse(
                call : Call<TokenModel>, response: retrofit2.Response<TokenModel>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let { it ->
                        it.data.forEach { data ->
                            mutableText.value = data.symbol
                        }
                    }
                } else {
                    // 실패
                }
            }

            override fun onFailure(call: Call<TokenModel>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}