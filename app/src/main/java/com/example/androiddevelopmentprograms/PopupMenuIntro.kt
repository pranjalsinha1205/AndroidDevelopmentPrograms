package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopupMenuIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_popup_menu_intro)
        var pop = findViewById<Button>(R.id.popupButton)
        pop.setOnClickListener {
            var m1 = PopupMenu(this, pop)
            var p1:MenuInflater = m1.menuInflater
            p1.inflate(R.menu.popup_menu, m1.menu)
            m1.setOnMenuItemClickListener { item:MenuItem ->
                when (item.itemId){
                    R.id.share ->{
                        Toast.makeText(this, "Share clicked", Toast.LENGTH_LONG).show()
                        true
                    }
                    R.id.delete ->{
                        Toast.makeText(this, "Delete clicked", Toast.LENGTH_LONG).show()
                        true
                    }
                    else -> super.onOptionsItemSelected(item)
                }
            }
            m1.show()
        }
    }
}