package com.example.madmeditationapptab

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Splashscreen : AppCompatActivity() {

    private val delay = 500 //задержка, 500 мс

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashscreen)

        Handler(Looper.getMainLooper()).postDelayed({ //отложенный запуск окна онбординга
            val intent = Intent(this, Onboarding::class.java)
            startActivity(intent)
            finish()
        }, delay.toLong())
    }
}