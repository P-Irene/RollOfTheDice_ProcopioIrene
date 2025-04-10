package com.example.rollofthedice

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) //serve a fare l'INFLATE del layout (legge XML e costruisce l'interaccia)

        var btnRoll : Button = findViewById(R.id.roll_btn)
        btnRoll.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "LANCIO DEL DADO!", Toast.LENGTH_LONG).show()
        })

        val mioIntent : Intent = Intent(this, SecondActivity::class.java)
        val mioRandom = (1..6).random()
        mioIntent.putExtra("MESSAGE", "NUMERO ESTRATTO: $mioRandom")
        mioIntent.putExtra("RANDOM", mioRandom)
        startActivity(mioIntent)
    }
}