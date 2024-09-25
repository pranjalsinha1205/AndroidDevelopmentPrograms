package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class IntentProgram : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_program)

        var name = findViewById<EditText>(R.id.name)
        var pwd = findViewById<EditText>(R.id.password)
        var login = findViewById<Button>(R.id.login)

        login.setOnClickListener {
            var i = Intent(this, FlipkartWelcome::class.java)
            startActivity(i)
        }
    }
}