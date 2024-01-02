package com.example.loginregisterrelative

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginregisterrelative.databinding.ActivityServicemanBinding

class serviceman : AppCompatActivity() {

    private lateinit var binding : ActivityServicemanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServicemanBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val country = intent.getStringExtra("country")
        val id = intent.getStringExtra("id")
        val imageId = intent.getIntExtra("imageId", R.drawable.gambar4)

        binding.namaTextview.text = name
        binding.negaraTextview.text = country
        binding.noIdTextview.text = id
        binding.fotoImageView.setImageResource(imageId)
        }
}