package com.example.androiddevelopmentprograms

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CA3 : AppCompatActivity() {
    val c = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca3)
        val share = findViewById<Button>(R.id.share)
        share.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION), c)
            }else{
                Toast.makeText(this, "Photo uploaded", Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onRequestPermissionsResult(requestCode : Int, permissions: Array<out String>, grantResults : IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == c){
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Photo uploaded", Toast.LENGTH_LONG).show()
            }
            else{
                var importLayout = LayoutInflater.from(this).inflate(R.layout.custom_ca3, null)
                var doer = AlertDialog.Builder(this).setView(importLayout)
                doer.setTitle("Denied").setCancelable(false)
                doer.setPositiveButton("Try Again"){dialog, _ -> Toast.makeText(this, "Trying Again", Toast.LENGTH_LONG).show()}
                doer.setNegativeButton("No"){dialog, _ -> }
                doer.create().show()
            }
        }
    }

}