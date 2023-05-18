package com.example.bottom

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class CrossfitActivity : AppCompatActivity() {
    lateinit var imgMeditations: ImageView
    lateinit var imgHealth: ImageView
    lateinit var imgMovements: ImageView
    lateinit var imgMedia: ImageView
    lateinit var imgSitups: ImageView
    lateinit var imgWorkouts: ImageView
    lateinit var btnGym: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crossfit)
        imgMeditations = findViewById(R.id.imgMeditations)
        imgHealth = findViewById(R.id.imgHealth)
        imgMovements = findViewById(R.id.imgMovements)
        imgMedia = findViewById(R.id.imgMedia)
        imgSitups = findViewById(R.id.imgSitups)
        imgWorkouts = findViewById(R.id.imgWorkouts)
        btnGym = findViewById(R.id.mBtnGym)


        imgMeditations.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/workout")

            startActivity(openURL)
        }
        imgHealth.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/230515")

            startActivity(openURL)
        }
        imgMovements.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/essentials/movements/")

            startActivity(openURL)
        }
        imgMedia.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/media")

            startActivity(openURL)
        }
        imgSitups.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/workout")

            startActivity(openURL)
        }
        imgWorkouts.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://www.crossfit.com/workout")

            startActivity(openURL)
        }
        btnGym.setOnClickListener {
            val openURL = Intent(Intent.ACTION_VIEW)
            openURL.data= Uri.parse("https://map.crossfit.com/")

            startActivity(openURL)
        }

    }
}