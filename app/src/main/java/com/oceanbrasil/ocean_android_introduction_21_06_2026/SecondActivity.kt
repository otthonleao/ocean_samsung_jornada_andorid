package com.oceanbrasil.ocean_android_introduction_21_06_2026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btVoltar = findViewById<Button>(R.id.btVoltar)
        val txTopo = findViewById<TextView>(R.id.txTopo)

        txTopo.setText(intent.getStringExtra("TEXTO"))

        btVoltar.setOnClickListener {
            val voltarIntent = Intent(this, MainActivity::class.java)
            startActivity(voltarIntent)
        }
    }
}