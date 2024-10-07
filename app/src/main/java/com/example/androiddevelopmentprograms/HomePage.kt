package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        var flipkartButton = findViewById<ImageButton>(R.id.flipkart)
        var groceryButton = findViewById<ImageButton>(R.id.grocery)
        var saleButton = findViewById<ImageButton>(R.id.sale)
        var txt = findViewById<TextView>(R.id.txt)

        var name = intent.getStringExtra("name1")
        txt.text = "Welcome to flipkart, $name!"

        flipkartButton.setOnClickListener {
            var i = Intent(this, Flipkart::class.java)
            startActivity(i)
        }

        groceryButton.setOnClickListener {
            var i = Intent(this, Grocery::class.java)
            startActivity(i)
        }

        saleButton.setOnClickListener {
            var i = Intent(this, Sales::class.java)
            startActivity(i)
        }
    }
}