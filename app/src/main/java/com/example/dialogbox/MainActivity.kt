package com.example.dialogbox

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {

            val alertDialog = AlertDialog.Builder(this).create()
            val layout = LayoutInflater.from(this).inflate(R.layout.custom_layout,null,false)

            val cancel = layout.findViewById<Button>(R.id.button)
            val yes = layout.findViewById<Button>(R.id.yesBtn)


            alertDialog.setCancelable(false)

            cancel.setOnClickListener {
               finish()
            }

            yes.setOnClickListener {
                alertDialog.cancel()
            }


            alertDialog.setView(layout)
            alertDialog.show()
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()

        val alertDialog = AlertDialog.Builder(this).create()
        val layout = LayoutInflater.from(this).inflate(R.layout.custom_layout,null,false)

        val cancel = layout.findViewById<Button>(R.id.button)
        val yes = layout.findViewById<Button>(R.id.yesBtn)

        alertDialog.setCancelable(false)

        cancel.setOnClickListener {
            finish()
        }

        yes.setOnClickListener {
            alertDialog.cancel()
        }

        alertDialog.setView(layout)
        alertDialog.show()

    }
}