package com.kelompok11sampimm1.arenafutsal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pesan.*

class Pesan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan)

        btnBack.setOnClickListener {
            finish()
        }
    }
}