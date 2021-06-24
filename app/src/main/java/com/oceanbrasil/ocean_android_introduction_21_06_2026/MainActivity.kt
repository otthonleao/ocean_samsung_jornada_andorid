package com.oceanbrasil.ocean_android_introduction_21_06_2026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btLimpar = findViewById<Button>(R.id.btLimpar)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etSobrenome = findViewById<EditText>(R.id.etSobrenome)
        val btNovaTela = findViewById<Button>(R.id.btNovaTela)

        btEnviar.setOnClickListener {
            tvResultado.text = etNome.text.toString();
            tvResultado.append(" ");
            tvResultado.append(etSobrenome.text.toString());
        }

        //Limpar os campos de nome e sobrenome
        btLimpar.setOnClickListener {
            etNome.text.clear();
            etSobrenome.text.clear();
            tvResultado.setText(R.string.tvResultado);
        }
        //Mudar de tela
        btNovaTela.setOnClickListener {
            val newScreenIntent = Intent(this, SecondActivity::class.java)
            //Para aparecer o texto da main em outra tela.
            newScreenIntent.putExtra("TEXTO", tvResultado.text.toString())
            startActivity(newScreenIntent);
        }
    }
}