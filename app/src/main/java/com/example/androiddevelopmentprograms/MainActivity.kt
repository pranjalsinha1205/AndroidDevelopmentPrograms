package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.editTextText)
        val mob = findViewById<EditText>(R.id.editTextText2)
        val btn = findViewById<Button>(R.id.button)
        val txt = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener {
            txt.text = "Welcome to the club, " + name.text.toString() + "\nYour id is " + mob.text.toString()
        }
    }
}