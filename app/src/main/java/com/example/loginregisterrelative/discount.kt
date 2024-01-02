package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class discount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discount)

        val btn_back = findViewById<ImageView>(R.id.back3)

        btn_back.setOnClickListener {
            val intentBack =
                Intent (this, Home::class.java)

            startActivity(intentBack)
        }
    }
}