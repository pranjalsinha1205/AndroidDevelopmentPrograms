package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlowerMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flower_main)

        var explore = findViewById<ImageButton>(R.id.start)
        var exploreText = findViewById<ImageButton>(R.id.startText)

        fun nextPage(){
            var i = Intent(this, FlowerBuy::class.java)
            startActivity(i)
        }

        explore.setOnClickListener {
            nextPage()
        }
        exploreText.setOnClickListener {
            nextPage()
        }
    }
}