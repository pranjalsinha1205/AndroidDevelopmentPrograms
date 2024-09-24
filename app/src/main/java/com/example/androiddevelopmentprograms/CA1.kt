package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca1)
        var name = findViewById<EditText>(R.id.first)
        var password = findViewById<EditText>(R.id.second)
        var login = findViewById<Button>(R.id.button)

        login.setOnClickListener {
            var username = name.text.toString()
            var pass = password.text.toString()
            var res = "Your username: " + username + "\nWelcome to Myntra"
            Toast.makeText(this, res, Toast.LENGTH_LONG).show()
        }
    }
}