package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BMICalculatorApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bmicalculator_app)
        val weight = findViewById<EditText>(R.id.editTextText5)
        val height = findViewById<EditText>(R.id.editTextText6)
        val submit = findViewById<Button>(R.id.button7)
        val txt = findViewById<TextView>(R.id.textView4)

        submit.setOnClickListener {
            // Get the text from EditText and convert to String
            val weightValue = weight.text.toString()
            val heightValue = height.text.toString()

            // Check if both values are not empty
            if (weightValue.isNotEmpty() && heightValue.isNotEmpty()) {
                // Convert to Double
                val weightInKgs = weightValue.toDouble()
                val heightInCms = heightValue.toDouble()

                // Calculate BMI
                val bmi = weightInKgs / ((heightInCms / 100) * (heightInCms / 100))

                // Format BMI to 1 decimal place
                val bmiFormatted = String.format("%.1f", bmi)

                // Determine BMI category
                var eval = when {
                    bmi < 18.5 -> "Underweight"
                    bmi in 18.5..24.9 -> "Normal"
                    bmi in 25.0..29.9 -> "Overweight"
                    else -> "Obese"
                }

                // Show the result in Toast and TextView
                val evaluation = "Your BMI: $bmiFormatted\n\nYou are in the $eval weight category"
                Toast.makeText(this, evaluation, Toast.LENGTH_LONG).show()
                txt.text = evaluation
                txt.setBackgroundColor(resources.getColor(android.R.color.black))
            } else {
                Toast.makeText(this, "Please enter both weight and height", Toast.LENGTH_LONG).show()
            }
        }
    }
}