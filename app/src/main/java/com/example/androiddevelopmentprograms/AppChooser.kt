package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AppChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
        val share = findViewById<Button>(R.id.share)
        share.setOnClickListener {
            shareTxt("Hello, share this message")
        }
    }

    fun shareTxt(message: String) {
        val send : Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooser1 : Intent = Intent.createChooser(send, "Share via")
        startActivity(chooser1)
    }
}