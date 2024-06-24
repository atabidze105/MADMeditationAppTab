package com.example.madmeditationapptab

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_photo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_close = findViewById<TextView>(R.id.btn_close) //инициализация кнопки

        btn_close.setOnClickListener { //Переход к профилю
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}