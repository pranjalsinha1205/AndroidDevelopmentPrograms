package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        //var password
        fun onClickProceed(){
            var i = Intent(this, HomePage::class.java)
            i.putExtra("name1", username.text.toString())
            startActivity(i)
        }

        var login = findViewById<ImageButton>(R.id.login)
        var loginText = findViewById<TextView>(R.id.loginText)

        login.setOnClickListener {
            onClickProceed()
        }

        loginText.setOnClickListener {
            onClickProceed()
        }

        val lpu = findViewById<Button>(R.id.lpu)
        lpu.setOnClickListener {
            var i = Intent(this, LPUFrontPage::class.java)
            startActivity(i)
        }
    }
}