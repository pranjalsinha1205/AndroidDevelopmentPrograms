package com.example.androiddevelopmentprograms

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class DialogueBoxIntro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dialogue_box_intro)

        val dialog_btn = findViewById<Button>(R.id.dialog)
        dialog_btn.setOnClickListener {
            var doer = AlertDialog.Builder(this)
            doer.setTitle("Exit")
            doer.setMessage("Do you really want to exit?")
            //when we click anywhere on screen apart from dialog box, it disappears, to remove this feature
            doer.setCancelable(false)
            doer.setPositiveButton("Yes"){dialog, _ -> finish()}
            doer.setNegativeButton("No"){dialog, _ -> dialog.dismiss()}
            doer.setNeutralButton("Maybe"){
                dialog, _ -> dialog.dismiss()
                Toast.makeText(this, "You clicked the MAYBE button", Toast.LENGTH_LONG).show()
            }
            doer.create()
            doer.show()
            //doer.create().show() yields the same result
        }
    }
}