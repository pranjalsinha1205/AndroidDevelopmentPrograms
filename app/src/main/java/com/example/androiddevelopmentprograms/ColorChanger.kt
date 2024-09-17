package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ColorChanger : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_changer)
        val txt = findViewById<LinearLayout>(R.id.linearLayout)
        val yellow = findViewById<Button>(R.id.yellow)
        val blue = findViewById<Button>(R.id.blue)
        val red = findViewById<Button>(R.id.red)
        val orange = findViewById<Button>(R.id.orange)
        val black = findViewById<Button>(R.id.black)
        val pink = findViewById<Button>(R.id.pink)
        val reset = findViewById<Button>(R.id.white)

        yellow.setOnClickListener {
            Toast.makeText(this, "Colour changed to yellow!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }
        blue.setOnClickListener {
            Toast.makeText(this, "Colour changed to blue!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.blue, null))
        }
        red.setOnClickListener {
            Toast.makeText(this, "Colour changed to red!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        orange.setOnClickListener {
            Toast.makeText(this, "Colour changed to orange!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.orange, null))
        }
        black.setOnClickListener {
            Toast.makeText(this, "Colour changed to black!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.black, null))
        }
        pink.setOnClickListener {
            Toast.makeText(this, "Colour changed to pink!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.pink, null))
        }
        reset.setOnClickListener {
            Toast.makeText(this, "Colour reset to white!", Toast.LENGTH_LONG).show()
            txt.setBackgroundColor(resources.getColor(R.color.white, null))
        }
    }
}