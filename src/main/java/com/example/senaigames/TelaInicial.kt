package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TelaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)

        var search = findViewById<ImageButton>(R.id.search)

        search.setOnClickListener{

            var intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)

        }
    }
}