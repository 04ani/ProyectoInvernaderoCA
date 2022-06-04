package com.example.invernadero_ca

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewBienvenido = findViewById<EditText>(R.id.textViewBienvenido)
        val bienvenido = textViewBienvenido.text.toString()
        val intent = Intent(this,MainActivity()::class.java).apply {}
        startActivity(intent)


    }
    fun InicioSecion(view: View){
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val usuario = etNombre.text.toString()
        val pass=findViewById<EditText>(R.id.editTextPassword)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            if (pass.text.toString() == "abc123") {
                val intent = Intent(this, InicioSecion::class.java)
                startActivity(intent)
            } else
                Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_LONG).show()
        }

    }
}

