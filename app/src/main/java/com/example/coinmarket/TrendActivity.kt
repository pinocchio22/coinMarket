package com.example.coinmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coinmarket.databinding.ActivityTrendBinding

class TrendActivity : AppCompatActivity() {
    lateinit var binding: ActivityTrendBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trend)
    }
}