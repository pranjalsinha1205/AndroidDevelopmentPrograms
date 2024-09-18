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

class TemperatureConverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_temperature_converter)
        var converter = findViewById<RadioGroup>(R.id.converter)
        var cf = findViewById<RadioButton>(R.id.cf)
        var fc = findViewById<RadioButton>(R.id.fc)
        var temp = findViewById<EditText>(R.id.temperature)
        var convert = findViewById<Button>(R.id.convert)
        var conversion = findViewById<TextView>(R.id.conversion)

        convert.setOnClickListener {
            var i = converter.checkedRadioButtonId
            var convertType = when (i){
                R.id.cf -> "CF"
                R.id.fc -> "FC"
                else -> ""
            }
            var newTemp:Double = 0.0
            if (convertType.equals("CF")){
                newTemp = temp.text.toString().toDouble() * 9 / 5
                newTemp += 32
                var appear = "${temp.text.toString()} degrees Celsius is ${newTemp.toString()} degrees Fahrenheit"
                conversion.text = appear
                Toast.makeText(this, appear, Toast.LENGTH_LONG).show()
            }
            else if (convertType.equals("FC")){
                var temp1 = temp.text.toString().toDouble() - 32
                newTemp = temp1 * 5 / 9
                var appear = "${temp.text.toString()} degrees Fahrenheit is ${newTemp.toString()} degrees Celsius"
                conversion.text = appear
                Toast.makeText(this, appear, Toast.LENGTH_LONG).show()
            }
            else{
                conversion.text = "You need to click the radio button!!!"
                Toast.makeText(this, "You need to click the radio button!!!", Toast.LENGTH_LONG).show()
            }
        }
    }
}