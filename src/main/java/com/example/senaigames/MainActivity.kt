package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timer().schedule(5000) {abrirApp()}
    }

    private fun abrirApp() {
        val intent = Intent(this, TelaInicial::class.java)
        startActivity(intent)
        finish()
    }
}