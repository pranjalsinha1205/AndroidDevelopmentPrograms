package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Sales : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sales)

        var logo = findViewById<ImageButton>(R.id.logo)
        logo.setOnClickListener {
            var i = Intent(this, HomePage::class.java)
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
        }    }
}