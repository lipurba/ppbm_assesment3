package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ncorti.slidetoact.SlideToActView

class slidetoact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slidetoact)
                val slideToActView= findViewById<SlideToActView>(R.id.geser)
                slideToActView.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
                    override fun onSlideComplete(view: SlideToActView) {
                        exitApp()

                    }

                    private fun exitApp() {
                        finishAffinity()
                        // Jika finishAffinity() tidak cukup, Anda bisa menggunakan System.exit(0)
                        // System.exit(0)
                    }
                }

                }

            }


