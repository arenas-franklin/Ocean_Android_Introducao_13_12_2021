package com.example.ocean_android_introducao_13_12_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultadp)

        //Obtem a informação que foi passado junto com o Intent
        val name = "NOME_DIGITADO"
        val value = intent.getCharSequenceExtra(name)

        val tvNome = findViewById<TextView>(R.id.tvNome)

        tvNome.text = value
    }
}