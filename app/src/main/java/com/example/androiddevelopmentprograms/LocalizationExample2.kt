package com.example.androiddevelopmentprograms

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class LocalizationExample2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_localization_example2)
        val eng = findViewById<Button>(R.id.eng)
        val hindi = findViewById<Button>(R.id.hindi)

        eng.setOnClickListener {
            setLocale("en")
        }

        hindi.setOnClickListener {
            setLocale("hi")
        }
    }
    fun setLocale(langCode : String){
        // Check if the current locale is different before applying the new one
        val current = resources.configuration.locales.get(0).language
        if (langCode != current)
        {
            val l = Locale(langCode)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c, resources.displayMetrics)
        }
        recreate()
    }
}