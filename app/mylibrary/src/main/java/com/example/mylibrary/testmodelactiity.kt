package com.example.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class testmodelactiity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testmodelactiity)

        Toast.makeText(this, "TEST LIB DEMO", Toast.LENGTH_SHORT).show()

    }
}