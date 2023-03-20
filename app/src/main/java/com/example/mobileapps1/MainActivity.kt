package com.example.mobileapps1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.photo)

        Picasso .with(this)
            .load("https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs2/122974376/original/00e3582d456ab63828a267b7bfd604cc96f0c67d/draw-you-a-cartoon-profile-picture-for-social-media.jpg")
            .fit()
            .into(image);

        val link = findViewById<FloatingActionButton>(R.id.link)
        link.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://github.com/DaphyneMaia/CA1-MobileApps")
            }
            startActivity(intent)
        }

        val ed = findViewById<Button>(R.id.E)
        ed.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val skills = findViewById<Button>(R.id.S)
        skills.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val ac = findViewById<Button>(R.id.A)
        ac.setOnClickListener{
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val exit = findViewById<Button>(R.id.EX)
        exit.setOnClickListener {

            finish()
        }
    }

}