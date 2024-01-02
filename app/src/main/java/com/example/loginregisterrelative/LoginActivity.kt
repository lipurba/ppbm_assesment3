package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_kembali =findViewById<ImageView>(R.id.L_bck_1)

        btn_kembali.setOnClickListener {
            val intentKembali =
                Intent (this, MainActivity::class.java)

            startActivity(intentKembali)
        }

        val txt_signup =findViewById<TextView>(R.id.txt_signup)

        txt_signup.setOnClickListener {
            val intentRegister =
                Intent (this, RegisterActivity::class.java)

            startActivity(intentRegister)
        }

        val btn_login =findViewById<Button>(R.id.L_btn_1)

        btn_login.setOnClickListener {
            val intentHome =
                Intent (this, Home::class.java)

            startActivity(intentHome)
        }




    }
}