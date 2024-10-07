package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class SnackbarIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar_intro)
        var submit = findViewById<Button>(R.id.button)

        submit.setOnClickListener {view->
            Snackbar.make(view, "This is a Snackbar!", Snackbar.LENGTH_LONG).setAction("undo"){
                Toast.makeText(this, "undo was clicked", Toast.LENGTH_LONG).show()
            }.show()
        }
    }
}

/*
grid layout 3x3
nine icons of various schools in uni
when i click on logo, i will get the snackbar, welcome to school of ___
at the place of action use open
*/