package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast


class service : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)

        val city = arrayOf("WORKSHOP SERVICE", "VISIT SERVICE",)

        val spinner = findViewById<Spinner>(R.id.S_spnr_1)
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, city)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected City is =" + city[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        val btn_back = findViewById<ImageView>(R.id.back1)

        btn_back.setOnClickListener {
            val intentBack =
                Intent(this, Home::class.java)

            startActivity(intentBack)
        }

        val btn_submit = findViewById<Button>(R.id.S_btn_1)

        btn_submit.setOnClickListener {
            Toast.makeText(this, "SUBMIT", Toast.LENGTH_SHORT).show()

        }

        val review = findViewById<Button>(R.id.S_btn_3)
        review.setOnClickListener {
            val Review = Intent(this, customlistview::class.java)
            startActivity(Review)
            finish()
            }

        val btn_rating = findViewById<Button>(R.id.S_btn_2)

        btn_rating.setOnClickListener {
            Toast.makeText(this, "THANK YOU", Toast.LENGTH_SHORT).show()

        }

        val history = findViewById<Button>(R.id.S_btn_4)
        history.setOnClickListener {
            val history = Intent(this, purchase::class.java)
            startActivity(history)
            finish()
        }




        }
    }

