package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        var god = findViewById<LinearLayout>(R.id.god_ascension)

        god.setOnClickListener{

            var intent = Intent(this, ViewGameActivity::class.java)
            startActivity(intent)

        }



    }
}