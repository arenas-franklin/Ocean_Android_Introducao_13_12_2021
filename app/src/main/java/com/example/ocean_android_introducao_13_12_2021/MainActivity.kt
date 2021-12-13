package com.example.ocean_android_introducao_13_12_2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Acessar o elemento que está no layout XML
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)



        // Declaramos um ouvinte para evento de clique no  btEnviar
        // Assim que um clique no btEnviar ocorrer, o código  dentro
        // das chaves {} será executado
        btEnviar.setOnClickListener{
            val nome = etNome.text

            // Alteramos o texto do tvResultado para uma string que quisermos
            tvResultado.text = nome
        }

    }
}