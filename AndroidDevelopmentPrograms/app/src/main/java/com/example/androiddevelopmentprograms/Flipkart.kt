package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Flipkart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flipkart)

        var logo = findViewById<ImageButton>(R.id.logo)
        logo.setOnClickListener {
//            var i = Intent(this, HomePage::class.java)
//            startActivity(i)

            finish()
        }

        var electronics = findViewById<ImageButton>(R.id.electronics)
        electronics.setOnClickListener {
            var i = Intent(this, Electronics::class.java)
            startActivity(i)
        }

        var books = findViewById<ImageButton>(R.id.books)
        books.setOnClickListener {
            var i = Intent(this, Books::class.java)
            startActivity(i)
        }

        var furniture = findViewById<ImageButton>(R.id.furniture)
        furniture.setOnClickListener {
            var i = Intent(this, Furniture::class.java)
            startActivity(i)
        }

        fun doPayment(){
            var i = Intent(this, Payment::class.java)
            startActivity(i)
        }

        var payment = findViewById<ImageButton>(R.id.buy)
        payment.setOnClickListener {
            doPayment()
        }

        var paymentText = findViewById<TextView>(R.id.buyText)
        paymentText.setOnClickListener {
            doPayment()
        }
    }
}