package com.example.rollofthedice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        val TAG = "SecondActivity"
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        Log.d(TAG, "inflate fatto")

        var msg = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.textViewActivitySecond)
        textView.text = msg
        val imageViewSecond = findViewById<ImageView>(R.id.imageViewActivitySecond)
        var random = intent.getIntExtra("RANDOM", -1)

        var resource = when (random) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {R.drawable.dices}
        }
        imageViewSecond.setImageResource(resource)
        Log.d(TAG, "FINITO DISEGNO DADO")

        val tvNext : TextView = findViewById(R.id.textView2ActivitySecond)
        tvNext.setOnClickListener(View.OnClickListener {
            val mioSecondoIntent : Intent = Intent(this, ThirdActivity::class.java)
            mioSecondoIntent.putExtra("RANDOM", random)
            startActivity(mioSecondoIntent)
            Log.d(TAG, "intent avviato")
        })
    }
}