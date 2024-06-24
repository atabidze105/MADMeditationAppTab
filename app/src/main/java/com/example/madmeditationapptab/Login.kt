package com.example.madmeditationapptab

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_profile = findViewById<Button>(R.id.btn_profile) //инициализация кнопки

        btn_profile.setOnClickListener { //Переход в профиль
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}