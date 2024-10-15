package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class spinners : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinners)
        val destinationSpinner : Spinner = findViewById(R.id.spinner)
        val packageListView : ListView = findViewById(R.id.list1)
        val destinations = arrayOf("Paris", "New York", "Tokyo")
        val packagesForParis = arrayOf("Eiffel Tower", "Louvre Museum", "Palace of Versailles")
        val packagesForNewYork = arrayOf("Statue of Liberty", "Central Park", "Madison Square")
        val packagesForTokyo = arrayOf("Tokyo Tower", "Mount Fuji", "Shibuya")

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, destinations)
        //array adapter is like a bridge which connects the array with frontend
        //this mean it connects with the same class

        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter = spinnerAdapter

        val initialAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, packagesForParis)
        packageListView.adapter = initialAdapter

        destinationSpinner.onItemSelectedListener =  object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedPackages = when (position){
                    0 -> packagesForParis
                    1 -> packagesForNewYork
                    else -> packagesForTokyo
                }

                val listAdapter = ArrayAdapter(this@spinners, android.R.layout.simple_list_item_1, selectedPackages)
                packageListView.adapter = listAdapter
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}