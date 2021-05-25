package com.narrador.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun jogarDado(view: View){
        var numero = Random.nextInt(1,7)
        var texto = findViewById(R.id.txvMensagem) as TextView
        texto.setText("O Número é: $numero")
    }
}