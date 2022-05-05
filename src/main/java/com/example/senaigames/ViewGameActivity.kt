package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ViewGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_game)

        var back = findViewById<ImageButton>(R.id.back)

        back.setOnClickListener {
            var intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}