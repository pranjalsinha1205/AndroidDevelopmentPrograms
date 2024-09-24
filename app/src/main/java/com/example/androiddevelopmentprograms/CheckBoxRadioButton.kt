package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CheckBoxRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box_radio_button)
        var group = findViewById<RadioGroup>(R.id.radioGroup)
//        var size_1 = findViewById<RadioButton>(R.id.radioButton4)
//        var size_2 = findViewById<RadioButton>(R.id.radioButton3)
//        var size_3 = findViewById<RadioButton>(R.id.radioButton)
        var top_1 = findViewById<CheckBox>(R.id.checkbox)
        var top_2 = findViewById<CheckBox>(R.id.checkbox2)
        var top_3 = findViewById<CheckBox>(R.id.checkbox3)
        var order = findViewById<Button>(R.id.button5)
        var txt = findViewById<TextView>(R.id.textView6)
        order.setOnClickListener {
            var i = group.checkedRadioButtonId
            val pizzaSize = when (i){
                R.id.radioButton4 -> "Small"
                R.id.radioButton3 -> "Medium"
                R.id.radioButton -> "Large"
                else -> ""
            }
            val toppings = mutableListOf<String>()
            if (top_1.isChecked) toppings.add("Extra Cheese")
            if (top_2.isChecked) toppings.add("Paneer")
            if (top_3.isChecked) toppings.add("Onion")
            var topp = ""
            for (i in toppings){
                topp += i + " "
            }
            val orderSummary = "Pizza Size: $pizzaSize\nToppings: $topp"
            Toast.makeText(this, orderSummary, Toast.LENGTH_LONG).show()
            txt.text = orderSummary
        }
    }
}