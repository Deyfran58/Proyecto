package com.example.aplicacion

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFavoritas = findViewById<Button>(R.id.btnFavoritas)
        val btnDesayuno = findViewById<Button>(R.id.btnDesayuno)

        btnFavoritas.setOnClickListener {
            startActivity(Intent(this, FavoritasActivity::class.java))
        }

        btnDesayuno.setOnClickListener {
            startActivity(Intent(this, DetalleRecetaActivity::class.java))
        }
    }
}
