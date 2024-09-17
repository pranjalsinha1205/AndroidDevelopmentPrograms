package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BillCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bill_calculator)
        val amount = findViewById<EditText>(R.id.amount)
        var tip = findViewById<RadioGroup>(R.id.tip)
        var tip_1 = findViewById<RadioButton>(R.id.noTip)
        var tip_2 = findViewById<RadioButton>(R.id.tip5)
        var tip_3 = findViewById<RadioButton>(R.id.tip10)
        var tip_4 = findViewById<RadioButton>(R.id.tip20)
        var total = findViewById<Button>(R.id.total)
        var totalBill = findViewById<TextView>(R.id.totalBill)

        total.setOnClickListener {
            var i = tip.checkedRadioButtonId
            val extra = when (i){
                R.id.noTip -> 0
                R.id.tip5 -> 5
                R.id.tip10 -> 10
                R.id.tip20 -> 20
                else -> 0
            }

            val percent = ((100 + extra).toDouble())/100
            val totalAmount = amount.text.toString().toDouble() * percent
            var overall = "Total bill is: Rs.$totalAmount"
            Toast.makeText(this, overall, Toast.LENGTH_LONG).show()
            totalBill.text = overall
        }
    }
}