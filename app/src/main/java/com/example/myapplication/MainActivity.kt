package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.mylibrary.Snacky
import com.example.mylibrary.testmodelactiity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.tvid)
        val layout = findViewById<ConstraintLayout>(R.id.lay_View)
        Snacky.showSnackbar(layout, "This is a test message!!")

        button.setOnClickListener {
            val intent = Intent(this, testmodelactiity::class.java)
            startActivity(intent)

        }



    }
}