package com.example.loginregisterrelative

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah = findViewById<Button>(R.id.btn_1)

        btn_pindah.setOnClickListener {
            val IntentPindah =
                Intent (this, LoginActivity ::class.java)

            startActivity(IntentPindah)
        }

        val btn_register = findViewById<Button>(R.id.btn_2)

        btn_register.setOnClickListener {
            val IntentRegister =
                Intent (this, RegisterActivity ::class.java)

            startActivity(IntentRegister)
        }

    }


}














