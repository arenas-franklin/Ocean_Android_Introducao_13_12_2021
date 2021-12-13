package com.example.ocean_android_introducao_13_12_2021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultadp)

        val btVoltar = findViewById<Button>(R.id.btvoltar)
        //Obtem a informação que foi passado junto com o Intent
        val name = "NOME_DIGITADO"
        val value = intent.getCharSequenceExtra(name)

        val tvNome = findViewById<TextView>(R.id.tvNome)

        tvNome.text = value


        btVoltar.setOnClickListener {
            finish()
        }
    }
}