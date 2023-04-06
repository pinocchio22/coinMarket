package com.example.coinmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coinmarket.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}