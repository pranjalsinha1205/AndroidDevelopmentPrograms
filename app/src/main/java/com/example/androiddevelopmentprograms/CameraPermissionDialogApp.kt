package com.example.androiddevelopmentprograms

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CameraPermissionDialogApp : AppCompatActivity() {
    val oc = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camera_permission_dialog_app)
        val camera = findViewById<Button>(R.id.cam)
        camera.setOnClickListener {
            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), oc)
            }else{
                val int = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(int)
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==oc){
            if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Permission is already granted", Toast.LENGTH_LONG).show()
            }
            else{
                val doer = AlertDialog.Builder(this)
                doer.setTitle("Permission Denied!")
                doer.setMessage("Permission has been denied.\nWould you like to try again?")
                doer.setCancelable(false)
                doer.setPositiveButton("Yes"){dialog, _ ->
                    val int = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                    startActivity(int)
                }
                doer.setNegativeButton("No"){dialog, _ ->
                    dialog.dismiss()
                }
            }
        }
    }
}