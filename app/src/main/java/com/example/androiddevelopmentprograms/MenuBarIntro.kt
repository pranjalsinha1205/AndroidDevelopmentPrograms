package com.example.androiddevelopmentprograms

import android.view.Menu
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuBarIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu_bar_intro)
        val t: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(t)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    //handle action bar item clicks here
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.i1 -> {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i2 -> {
                Toast.makeText(this, "Display clicked", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i3 -> {
                Toast.makeText(this, "About phone clicked", Toast.LENGTH_LONG).show()
                true
            }
            R.id.i4 -> {
                Toast.makeText(this, "Developer options clicked", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}