package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.GridLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ColorChangerGrid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_color_changer_grid)
        var grid = findViewById<GridLayout>(R.id.gridLayout)
        var yellow = findViewById<Button>(R.id.ye)
        var blue = findViewById<Button>(R.id.bl)
        var red = findViewById<Button>(R.id.re)
        var orange = findViewById<Button>(R.id.or)
        var pink = findViewById<Button>(R.id.pi)
        var black = findViewById<Button>(R.id.dark)
        var reset = findViewById<Button>(R.id.re)

        yellow.setOnClickListener {
            Toast.makeText(this, "Colour changed to yellow!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }
        blue.setOnClickListener {
            Toast.makeText(this, "Colour changed to blue!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.blue, null))
        }
        red.setOnClickListener {
            Toast.makeText(this, "Colour changed to red!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        orange.setOnClickListener {
            Toast.makeText(this, "Colour changed to orange!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.orange, null))
        }
        black.setOnClickListener {
            Toast.makeText(this, "Colour changed to black!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.black, null))
        }
        pink.setOnClickListener {
            Toast.makeText(this, "Colour changed to pink!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.pink, null))
        }
        reset.setOnClickListener {
            Toast.makeText(this, "Colour reset to white!", Toast.LENGTH_LONG).show()
            grid.setBackgroundColor(resources.getColor(R.color.white, null))
        }
    }
}