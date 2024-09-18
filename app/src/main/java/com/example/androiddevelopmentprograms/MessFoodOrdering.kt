package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MessFoodOrdering : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mess_food_ordering)
        var meals = findViewById<RadioGroup>(R.id.meal_group)
        var veg = findViewById<RadioButton>(R.id.veg)
        var nonveg = findViewById<RadioButton>(R.id.nonveg)
        var veg_nonveg = findViewById<RadioButton>(R.id.veg_nonveg)
        var raita = findViewById<CheckBox>(R.id.raita)
        var salad = findViewById<CheckBox>(R.id.salad)
        var order = findViewById<ImageButton>(R.id.orderMeal)
        var orderText = findViewById<TextView>(R.id.orderText)
        var finalOrder = findViewById<TextView>(R.id.finalOrder)

        fun processOrder(){
            var i = meals.checkedRadioButtonId
            var meal = when (i){
                R.id.veg -> "Veg Thali"
                R.id.nonveg -> "Non Veg Thali"
                R.id.veg_nonveg -> "Veg Non Veg Combo Thali"
                else -> ""
            }
            var sides = mutableListOf<String>()
            if (raita.isChecked) sides.add("Raita")
            if (salad.isChecked) sides.add("Salad")

            var orderFinal = "Your order is $meal with $sides"
            finalOrder.text = orderFinal
            Toast.makeText(this, orderFinal, Toast.LENGTH_LONG).show()
        }
        order.setOnClickListener {
            processOrder()
        }

        orderText.setOnClickListener {
            processOrder()
        }
    }
}