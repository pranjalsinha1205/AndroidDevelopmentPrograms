package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class ContextMenuIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menu_intro)
        var i1=findViewById<ImageView>(R.id.imageView2)
        registerForContextMenu(i1)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu,v,menuInfo)
        menuInflater.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var i2=findViewById<ImageView>(R.id.imageView2)
        return when(item.itemId){

            R.id.colChange-> {
//                i2.setColorFilter(R.color.black)
//                i2.setColorFilter(ContextCompat.getColor(this, R.color.black))
                i2.setBackgroundColor(resources.getColor(R.color.blue, null))
                Toast.makeText(this, "Color changed", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.rotate->{
                i2.rotation=i2.rotation+45f
                Toast.makeText(this, "clicked item", Toast.LENGTH_SHORT).show()
                return true
            }
            else->super.onOptionsItemSelected(item)
        }
    }
}