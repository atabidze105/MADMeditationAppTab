package com.example.madmeditationapptab

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val btn_sidemenu = findViewById<ImageView>(R.id.btn_sidemenu) //инициализация кнопок
        val btn_sounds = findViewById<ImageView>(R.id.btn_sounds);
        val btn_home = findViewById<ImageView>(R.id.btn_home);
        val btn_forest = findViewById<ImageView>(R.id.imageview_forest)
        val btn_exit = findViewById<TextView>(R.id.btn_exit)

        btn_sidemenu.setOnClickListener { //переход в меню
            val intent: Intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        btn_sounds.setOnClickListener { //переход к аудиозаписям
            val intent: Intent = Intent(this, Listen::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener { //переход к аудиозаписям
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        btn_forest.setOnClickListener { //переход к фото
            val intent: Intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }

        btn_exit.setOnClickListener{ //Переход к онбордингу (к адаптации? самое начало крч)
            val intent: Intent = Intent(this, Onboarding::class.java)
            startActivity(intent)
        }
    }
}