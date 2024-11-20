package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecipeApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recipe_app)

        var breakfast = findViewById<ImageButton>(R.id.breakfast)
        var lunch = findViewById<ImageButton>(R.id.lunch)
        var snacks = findViewById<ImageButton>(R.id.snacks)
        var dinner = findViewById<ImageButton>(R.id.dinner)
    }
}