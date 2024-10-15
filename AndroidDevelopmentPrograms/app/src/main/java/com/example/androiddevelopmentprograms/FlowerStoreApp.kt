package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class FlowerStoreApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_flower_store_app)
        var group1 = findViewById<RadioGroup>(R.id.group1)
        var group2 = findViewById<RadioGroup>(R.id.group2)
        var first = findViewById<RadioButton>(R.id.first)
        var second = findViewById<RadioButton>(R.id.second)
        var third = findViewById<RadioButton>(R.id.third)
        var fourth = findViewById<RadioButton>(R.id.fourth)
        var fifth = findViewById<RadioButton>(R.id.fifth)
        var takeaway = findViewById<RadioButton>(R.id.takeaway)
        var delivery = findViewById<RadioButton>(R.id.delivery)
        var orderFlowers = findViewById<Button>(R.id.flowerOrder)
        var flowerView = findViewById<TextView>(R.id.flowerView)

        orderFlowers.setOnClickListener {
            var i = group1.checkedRadioButtonId
            var bouquet = when (i){
                R.id.first -> "Sunflowers"
                R.id.second -> "Roses"
                R.id.third -> "Tulips"
                R.id.fourth -> "Lotuses"
                R.id.fifth -> "Daffodils"
                else -> ""
            }

            var j = group2.checkedRadioButtonId
            var howToTake = when (j){
                R.id.takeaway -> "Takeaway"
                R.id.delivery -> "Deliver"
                else -> ""
            }
            var statement = "You have ordered a bouquet of $bouquet\nYou have chosen to $howToTake this order"
            Toast.makeText(this, statement, Toast.LENGTH_LONG).show()
            flowerView.text = statement
        }

    }
}