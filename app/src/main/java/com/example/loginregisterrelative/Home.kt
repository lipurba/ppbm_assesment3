package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn_back = findViewById<ImageView>(R.id.H_back)

        btn_back.setOnClickListener {
            val intentMain =
                Intent (this, slidetoact::class.java)

            startActivity(intentMain)
        }

        val btn_new = findViewById<RelativeLayout>(R.id.pencet_new)

        btn_new.setOnClickListener {
            val intentMain =
                Intent (this, newproduct::class.java)

            startActivity(intentMain)
        }

        val btn_service = findViewById<RelativeLayout>(R.id.service)

        btn_service.setOnClickListener {
            val intentMain =
                Intent (this, service::class.java)

            startActivity(intentMain)
        }

        val btn_about = findViewById<RelativeLayout>(R.id.about1)

        btn_about.setOnClickListener {
            val intentMain =
                Intent (this, About::class.java)

            startActivity(intentMain)
        }

        val btn_discount = findViewById<RelativeLayout>(R.id.discount)

        btn_discount.setOnClickListener {
            val intentMain =
                Intent (this, discount::class.java)

            startActivity(intentMain)
        }

        val btn_profile = findViewById<RelativeLayout>(R.id.profile)

        btn_profile.setOnClickListener {
            val intentMain =
                Intent (this, profile::class.java)

            startActivity(intentMain)
        }

        val btn_location = findViewById<RelativeLayout>(R.id.location)

        btn_location.setOnClickListener {
            val intentMain =
                Intent (this, Location::class.java)

            startActivity(intentMain)
        }







    }


}