package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_kembali =findViewById<ImageView>(R.id.R_bck_1)

        btn_kembali.setOnClickListener {
            val intentKembali =
                Intent (this, MainActivity::class.java)

            startActivity(intentKembali)
        }

        val btn_login =findViewById<Button>(R.id.R_btn_1)

        btn_login.setOnClickListener {
            val intentHome =
                Intent (this, Home::class.java)

            startActivity(intentHome)
        }

        val txt_signin = findViewById<TextView>(R.id.txt_signin)

        txt_signin.setOnClickListener {
            val intentLogin =
                Intent (this, LoginActivity::class.java)

            startActivity(intentLogin)
        }

    }
}