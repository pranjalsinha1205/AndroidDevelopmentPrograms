package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LPUHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpuhome)
        var cse = findViewById<ImageButton>(R.id.cse)
        var ece = findViewById<ImageButton>(R.id.ece)
        var mec = findViewById<ImageButton>(R.id.mec)
        var architecture = findViewById<ImageButton>(R.id.architecture)
        var agri = findViewById<ImageButton>(R.id.agri)
        var fashion = findViewById<ImageButton>(R.id.fashion)
        var pharma = findViewById<ImageButton>(R.id.pharma)
        var multi = findViewById<ImageButton>(R.id.multi)
        var law = findViewById<ImageButton>(R.id.law)

        //1 intro page to take from lpu touch
        //9 different opening pages with intents, snackbar, and Toasts
    }
}