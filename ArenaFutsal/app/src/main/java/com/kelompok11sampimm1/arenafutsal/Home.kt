package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_Pembayaran.setOnClickListener {
            val intent = Intent(this, Pembayaran::class.java)
            startActivity(intent)
        }

        btn_Pesan.setOnClickListener {
            val intent = Intent(this, Pesan::class.java)
            startActivity(intent)
        }

        btn_Jadwal.setOnClickListener {
            val intent = Intent(this, Jadwal::class.java)
            startActivity(intent)
        }

        btn_Profil.setOnClickListener {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }

        btn_Detail.setOnClickListener {
            val intent = Intent(this, DetailInformasi::class.java)
            startActivity(intent)
        }
        btn_Maps.setOnClickListener {
            val intent = Intent(this, Maps::class.java)
            startActivity(intent)
        }
    }
}