package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profil.*
import kotlinx.android.synthetic.main.activity_sign_in.*

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        btnBack.setOnClickListener {
            finish()
        }
        btnLogout.setOnClickListener {
            val intent = Intent(this, HalamanAwal::class.java)
            startActivity(intent)
        }
    }
}