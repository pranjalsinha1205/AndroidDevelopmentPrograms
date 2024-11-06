package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class QuoteChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_quote_chooser)
        val q1 = findViewById<CheckBox>(R.id.q1)
        val q2 = findViewById<CheckBox>(R.id.q2)
        val q3 = findViewById<CheckBox>(R.id.q3)
        val q4 = findViewById<CheckBox>(R.id.q4)
        val q5 = findViewById<CheckBox>(R.id.q5)
        val share = findViewById<Button>(R.id.share)
        val rate = findViewById<Button>(R.id.rate)

        share.setOnClickListener {
            var quotes = mutableListOf<String>()
            if (q1.isChecked) quotes.add(q1.text.toString())
            if (q2.isChecked) quotes.add(q2.text.toString())
            if (q3.isChecked) quotes.add(q3.text.toString())
            if (q4.isChecked) quotes.add(q4.text.toString())
            if (q5.isChecked) quotes.add(q5.text.toString())

            var quote : String = ""

            for (i in quotes){
                quote += i + "\n"
            }
            shareQuotes(quote)
        }

        rate.setOnClickListener {
            var doer = AlertDialog.Builder(this)
            doer.setTitle("Rate Us!")
            doer.setMessage("Would you like to rate us?")
            doer.setCancelable(false)
//            doer.setPositiveButton("Yes"){i, _ -> Intent(this, )}
            doer.setNegativeButton("No"){dialog, _ -> dialog.dismiss()}
//            doer.setNeutralButton()
        }

//        fun newPage(){
//            var i = Intent(this::)
//        }
    }
    fun shareQuotes(message:String){
        val send : Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooser1 : Intent = Intent.createChooser(send, "Share via")
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        startActivity(chooser1)
    }
}