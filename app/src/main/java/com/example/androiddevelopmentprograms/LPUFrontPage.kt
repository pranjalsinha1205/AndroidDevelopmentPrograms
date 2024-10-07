package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LPUFrontPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpufront_page)
        var explore = findViewById<Button>(R.id.explore)

        explore.setOnClickListener {
            Toast.makeText(this, "Welcome to the Schools of LPU!", Toast.LENGTH_LONG).show()
            var i = Intent(this, LPUHome::class.java)
            startActivity(i)
        }
    }
}