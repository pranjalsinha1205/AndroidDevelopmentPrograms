package com.example.androiddevelopmentprograms

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ExplicitImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_implicit_intent)

        val explicitButton = findViewById<Button>(R.id.explicit)
        val implicitButton = findViewById<Button>(R.id.implicit)

        explicitButton.setOnClickListener {
            val intent = Intent(this, BillCalculator::class.java)
            startActivity(intent)
        }

        implicitButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            val url = "www.google.co.in"
            intent.data = Uri.parse(url)
        }
    }
}