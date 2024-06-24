package com.example.madmeditationapptab

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboarding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_login = findViewById<Button>(R.id.btn_login) //инициализация кнопок
        val btn_registration = findViewById<TextView>(R.id.btn_registration)

        btn_login.setOnClickListener{ //Переход к окну входа
            val intent: Intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        btn_registration.setOnClickListener{ //Переход к регистрации
            val intent: Intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}