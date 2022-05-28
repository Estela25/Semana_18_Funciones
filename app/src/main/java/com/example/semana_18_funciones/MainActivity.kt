package com.example.semana_18_funciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvHolaMundo=findViewById(R.id.tvHolaMundo) as TextView
        val tvCadena=findViewById(R.id.tvCadena) as TextView
        val btEjecutar=findViewById(R.id.btEjecutar) as Button


        tvHolaMundo.text = "¡Bienvenidos al curso de Android con Kotlin"
        btEjecutar.setOnClickListener{
            tvCadena.text = "Tu nombre es: Juan Perez"
            Toast.makeText(this,"Has cambiado el texto",Toast.LENGTH_LONG).show()
        }
    }
        }

