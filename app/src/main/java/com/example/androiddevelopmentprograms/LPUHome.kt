package com.example.androiddevelopmentprograms

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LPUHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lpuhome)
        var cse = findViewById<ImageButton>(R.id.cse)
        var ece = findViewById<ImageButton>(R.id.ece)
        var mec = findViewById<ImageButton>(R.id.mec)
        var architecture = findViewById<ImageButton>(R.id.architecture)
        var agri = findViewById<ImageButton>(R.id.agri)
        var fashion = findViewById<ImageButton>(R.id.fashion)
        var pharma = findViewById<ImageButton>(R.id.pharma)
        var multi = findViewById<ImageButton>(R.id.multi)
        var law = findViewById<ImageButton>(R.id.law)

        //1 intro page to take from lpu touch
        //9 different opening pages with intents, snackbar, and Toasts with action as open
        cse.setOnClickListener {view->
            val text = "Welcome to the School of Computer Science"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        ece.setOnClickListener {view->
            val text = "Welcome to the School of Electronics and Communication Engineering"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        mec.setOnClickListener {view->
            val text = "Welcome to the School of Mechanical Engineering"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        architecture.setOnClickListener {view->
            val text = "Welcome to the School of Architecture"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        agri.setOnClickListener {view->
            val text = "Welcome to the School of Agriculture"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        fashion.setOnClickListener {view->
            val text = "Welcome to the School of Fashion"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        pharma.setOnClickListener {view->
            val text = "Welcome to the School of Pharmacy"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        multi.setOnClickListener {view->
            val text = "Welcome to the School of Multimedia"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

        law.setOnClickListener {view->
            val text = "Welcome to the School of Law"
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction("open"){
                Toast.makeText(this, "Open was clicked", Toast.LENGTH_LONG).show()
                var i = Intent(this, WelcomePage::class.java)
                i.putExtra("welcomeMessage", text)
                startActivity(i)
            }.show()
        }

    }
}