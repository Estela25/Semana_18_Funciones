package com.example.semana_18_funciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity(), TextWatcher {

    private var eNombre: EditText? = null
    private var eEdad: EditText? = null
    private var textNombre: TextView? = null
    private var textEdad: TextView? = null
    private var nombre: String? = null
    private var etEdad = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        eNombre = findViewById(R.id.etNombre) as EditText
        eEdad = findViewById(R.id.etEdad) as EditText
        textNombre = findViewById(R.id.tvMostrarNombre) as TextView
        textEdad = findViewById(R.id.etEdad) as TextView
        val btEjecutarEstado=findViewById(R.id.btEjecutar) as Button
        val tvDatosIngresar=findViewById(R.id.tvDatosIngresar) as TextView
        eNombre?.addTextChangedListener(this)
        eEdad?.addTextChangedListener(this)

        btEjecutarEstado.setOnClickListener(){
            nombre = eNombre?.text.toString()
            etEdad = Integer.valueOf(eEdad?.text.toString())
            if(etEdad < 18)
                tvDatosIngresar.text = "Eres menor de edad"
            else
                tvDatosIngresar.text = "Eres mayor de edad"

            Toast.makeText(this,nombre,Toast.LENGTH_LONG).show()
        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        Toast.makeText(this,p0.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        nombre = eNombre?.text.toString()
        etEdad   = Integer.valueOf(eEdad?.text.toString())
        textNombre?.text = nombre
        textEdad?.text = etEdad.toString()

    }

    override fun afterTextChanged(p0: Editable?) {
    }
}