package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_halaman_awal.*
import kotlinx.android.synthetic.main.activity_sign_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignUp2.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        btn_SignIn2.setOnClickListener {
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

    }
}