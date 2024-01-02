package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Location : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        val btn_location = findViewById<Button>(R.id.Loc_back)

        btn_location.setOnClickListener {
            val intentBack =
                Intent (this, Home::class.java)
            startActivity(intentBack)
        }
    }
}