package com.example.loginregisterrelative

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class listvieew : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listvieew)

        // Misalnya, menggunakan array sebagai contoh data
        val dataArray = arrayOf("KNALPOT", "SHOCKBREAKER", "LAMPU", "OLI", "FILTER UDARA", "SAKLAR", "ACCU")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dataArray)
        val listView: ListView = findViewById(R.id.namaproduk)
        listView.adapter = adapter




    }
}