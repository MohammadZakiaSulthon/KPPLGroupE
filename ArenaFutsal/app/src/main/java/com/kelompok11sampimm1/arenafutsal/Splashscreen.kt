package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        Handler(mainLooper).postDelayed({
            val intent = Intent(this, Onboarding::class.java)
            startActivity(intent)
        },2000)
    }
}