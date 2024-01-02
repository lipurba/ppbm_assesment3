package com.example.loginregisterrelative

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class About : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btn_back = findViewById<Button>(R.id.A_back)

        btn_back.setOnClickListener {
            val intenBack =
                Intent (this, Home::class.java)

            startActivity(intenBack)
        }

        lateinit var btnShowBottomSheet: Button

        btnShowBottomSheet = findViewById(R.id.about2);

        btnShowBottomSheet.setOnClickListener{

            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.activity_bottomsheet, null)
            val btnClose = view.findViewById<Button>(R.id.A_back1)

            btnClose.setOnClickListener {
                dialog.dismiss()
            }

            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}