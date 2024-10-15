package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class GridLayoutLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout_learning)
        var a=findViewById<ImageButton>(R.id.imageButton4)
        var b=findViewById<ImageButton>(R.id.imageButton5)
        a.setOnClickListener {
            Toast.makeText(this,"image button clicked",Toast.LENGTH_LONG).show()
        }
    }


}