package com.example.ocean_android_introducao_13_12_2021

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

        // Acessar o elemento que está no layout XML
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)
        val btAbrirTela = findViewById<Button>(R.id.btAbrirTela)



        // Declaramos um ouvinte para evento de clique no  btEnviar
        // Assim que um clique no btEnviar ocorrer, o código  dentro
        // das chaves {} será executado
        btEnviar.setOnClickListener{
            val nome = etNome.text

            // Caso o nome estha em branco, entrar  no if
            if (nome.isBlank()){
                //Exibe uma mensagem de erro nome  válido
                etNome.error = "Digite um nome válido "
            }else {

                // Alteramos o texto do tvResultado para uma string que quisermos
                tvResultado.text = nome
            }
        }

        // Detectar clqiue no botão btnAbrirTela
        btAbrirTela.setOnClickListener {
            val abrirTelaIntent = Intent(this, ResultadpActivity::class.java)

            // Adiciona uma informação à Intent que abre uma nova tela
            val nome= etNome.text
            abrirTelaIntent.putExtra("NOME_DIGITADO", nome)

            startActivity(abrirTelaIntent)
        }
    }
}