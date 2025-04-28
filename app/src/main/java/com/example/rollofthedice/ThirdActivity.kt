package com.example.rollofthedice

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "ThirdActivity"
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)
        Log.d(TAG, "inflate fatto")

        val textViewThird = findViewById<TextView>(R.id.textViewActivityThird)
        val imageViewThird = findViewById<ImageView>(R.id.imageViewActivityThird)
        var resource = R.drawable.dices

        val random = intent.getIntExtra("RANDOM", -1)
        var resultActivityThird = ""

        if(random%2 == 0){
            resultActivityThird = "YOU WON!"
            resource = R.drawable.vinto
        }else{
            resultActivityThird = "YOU LOST :("
            resource = R.drawable.perso
        }
        textViewThird.setText(resultActivityThird)
        imageViewThird.setImageResource(resource)
        Log.d(TAG, "fine gioco")
    }
}