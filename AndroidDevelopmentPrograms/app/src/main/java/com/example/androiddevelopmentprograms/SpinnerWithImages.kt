package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class SpinnerWithImages : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner_with_images)

        // Set up the views
        val rootLayout: ConstraintLayout = findViewById(R.id.new_spinner)
        val destinationSpinner: Spinner = findViewById(R.id.spinner)
        val packageListView: ListView = findViewById(R.id.list1)

        // Arrays for spinner and list items
        val destinations = arrayOf("Paris", "New York", "Tokyo")
        val packagesForParis = arrayOf("Eiffel Tower", "Louvre Museum", "Palace of Versailles")
        val packagesForNewYork = arrayOf("Statue of Liberty", "Central Park", "Madison Square")
        val packagesForTokyo = arrayOf("Tokyo Tower", "Mount Fuji", "Shibuya")

        // Set default background to Paris
        rootLayout.setBackgroundResource(R.drawable.paris)

        // Spinner adapter
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, destinations)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        destinationSpinner.adapter = spinnerAdapter

        // Initial list for Paris
        val initialAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, packagesForParis)
        packageListView.adapter = initialAdapter

        // Set onItemSelectedListener for the spinner
        destinationSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Change list items based on selected destination
                val selectedPackages = when (position) {
                    0 -> packagesForParis
                    1 -> packagesForNewYork
                    else -> packagesForTokyo
                }

                // Update list view
                val listAdapter = ArrayAdapter(this@SpinnerWithImages, android.R.layout.simple_list_item_1, selectedPackages)
                packageListView.adapter = listAdapter

                // Change background based on selected city
                when (position) {
                    0 -> rootLayout.setBackgroundResource(R.drawable.paris)
                    1 -> rootLayout.setBackgroundResource(R.drawable.new_york)
                    2 -> rootLayout.setBackgroundResource(R.drawable.tokyo)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }
    }
}
