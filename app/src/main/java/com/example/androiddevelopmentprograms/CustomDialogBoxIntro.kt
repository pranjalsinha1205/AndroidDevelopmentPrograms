package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomDialogBoxIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_dialog_box_intro)

        var subscribe = findViewById<Button>(R.id.subscribe)
        subscribe.setOnClickListener {
            var importLayout = LayoutInflater.from(this).inflate(R.layout.customer_dialog_intro, null)
            var doer = AlertDialog.Builder(this).setView(importLayout)
            doer.setPositiveButton("Subscribe") { dialog, _ ->
                val e = importLayout.findViewById<EditText>(R.id.email)
                val email = e.text.toString()
                if (email.isNotBlank()) {
                    Toast.makeText(this, "Subscribed with $email", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Please enter a valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            doer.setNegativeButton("Cancel") { dialog, _ -> dialog.dismiss() }

            doer.create().show()
        }
    }
}