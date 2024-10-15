package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SimpleCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_simple_calculator)
        val num1 = findViewById<EditText>(R.id.editTextText3)
        val num2 = findViewById<EditText>(R.id.editTextText4)
        val add = findViewById<Button>(R.id.button2)
        val diff = findViewById<Button>(R.id.button6)
        val prod = findViewById<Button>(R.id.button3)
        val div = findViewById<Button>(R.id.button4)
        val res = findViewById<TextView>(R.id.textView5)

        add.setOnClickListener {
            val result = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            res.text = num1.text.toString() + " + " + num2.text.toString() + " = " + result.toString()
        }
        diff.setOnClickListener {
            val result = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            res.text = num1.text.toString() + " + " + num2.text.toString() + " = " + result.toString()
        }
        prod.setOnClickListener {
            val result = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            res.text = num1.text.toString() + " + " + num2.text.toString() + " = " + result.toString()
        }
        div.setOnClickListener {
            val result = num1.text.toString().toDouble() / num2.text.toString().toDouble()
            res.text = num1.text.toString() + " + " + num2.text.toString() + " = " + result.toString()
        }
    }
}