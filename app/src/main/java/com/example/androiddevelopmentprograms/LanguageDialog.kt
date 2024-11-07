package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LanguageDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_language_dialog)
        var lang = findViewById<Button>(R.id.language)
        lang.setOnClickListener {
            var languages = arrayOf("English", "Russian", "Danish", "French", "Italian")
            var importLayout = LayoutInflater.from(this).inflate(R.layout.language_dialog, null)
            var langList : ListView = importLayout.findViewById(R.id.languageList)

            var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
            langList.adapter = adapter

            var doer = AlertDialog.Builder(this)
                .setView(importLayout)
                .setTitle("Select a language")
                .create()

            langList.onItemClickListener = AdapterView.OnItemClickListener{_, _, position, _ ->
                val language = languages[position]
                Toast.makeText(this, "You have selected $language", Toast.LENGTH_LONG).show()
                doer.dismiss()
            }
            doer.show()

        }
    }
}