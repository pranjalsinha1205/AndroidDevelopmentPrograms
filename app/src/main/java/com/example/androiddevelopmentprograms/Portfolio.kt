package com.example.androiddevelopmentprograms

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Portfolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_portfolio)
        val t : androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(t)

        val academic = findViewById<ImageButton>(R.id.academics)
        val certifications = findViewById<ImageButton>(R.id.certifications)
        val hobbies = findViewById<ImageButton>(R.id.hobbies)
        val projects = findViewById<ImageButton>(R.id.projects)
        val gallery = findViewById<ImageButton>(R.id.gallery)
        val skills = findViewById<ImageButton>(R.id.skills)

        academic.setOnClickListener {  }

        certifications.setOnClickListener {  }

        hobbies.setOnClickListener {  }

        projects.setOnClickListener {  }

        gallery.setOnClickListener {  }

        skills.setOnClickListener {  }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.portfolio_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.email ->{//implicit
                val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                    data = Uri.parse("mailto:pranjal@email.com")
                    putExtra(Intent.EXTRA_SUBJECT, "Your Subject")
                    putExtra(Intent.EXTRA_TEXT, "Your email body")
                }
                if (emailIntent.resolveActivity(packageManager) != null) {
                    startActivity(emailIntent)
                }
                true
            }
            R.id.phone ->{//implicit
                val i = Intent(Intent.ACTION_DIAL)
                i.data = Uri.parse("tel:1234567890")
                startActivity(i)
                true
            }
            R.id.feedback ->{//explicit
                val i = Intent(this, FeedbackPortfolio::class.java)
                startActivity(i)
                true
            }
            R.id.exit ->{
                var doer = AlertDialog.Builder(this)
                doer.setTitle("Exit")
                doer.setMessage("Do you really wish to exit?")
                doer.setCancelable(false)
                doer.setPositiveButton("Yes"){dialog, _ -> finish()}
                doer.setNegativeButton("No"){dialog, _ -> dialog.dismiss()}
                doer.setNeutralButton("Maybe..."){dialog, _ ->
                    Toast.makeText(this, "I am just here to take space\nI don't have any actual use", Toast.LENGTH_LONG).show()
                    dialog.dismiss()
                }
                doer.create().show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /*
    portfolio app:-
    i) name -> side mein -> email, contact, feedback
    ii) 6 grid layout image buttons
    a) academic,
    b) certifications
    c) hobbies
    d) project
    e) photo gallery
    f) skills
    */
}