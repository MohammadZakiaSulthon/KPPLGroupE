package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        btnSignIn1.setOnClickListener {
            val email = Email1.text.toString()
            val password = Password1.text.toString()
            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(email == "user1@gmail.com" || password == "user1"){
                val intent = Intent (this,Home::class.java)
                startActivity(intent)
                finish()
            }
            if(email == "admin1@gmail.com" || password == "admin"){
                val intent = Intent (this,Admin::class.java)
                startActivity(intent)
                finish()
            }
        }

        btn_SignUp1.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

    }
}