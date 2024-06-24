package com.example.madmeditationapptab

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_sidemenu = findViewById<ImageView?>(R.id.btn_sidemenu) //инициализация кнопок
        val btn_profile = findViewById<ImageView?>(R.id.btn_profile)
        val btn_profilepic = findViewById<ImageView>(R.id.btn_profilepic)
        val btn_sounds = findViewById<ImageView?>(R.id.btn_sounds);


        btn_sidemenu.setOnClickListener {//переход в меню
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        btn_profile.setOnClickListener{//Переход в профиль
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        btn_profilepic.setOnClickListener{//Переход в профиль
            val intent: Intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        btn_sounds.setOnClickListener {//переход к аудиозаписям
            val intent: Intent = Intent(this, Listen::class.java)
            startActivity(intent)
        }
    }
}