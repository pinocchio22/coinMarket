package com.example.coinmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coinmarket.databinding.ActivityAccountBinding

class AccountActivity : AppCompatActivity() {
    lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
    }
}