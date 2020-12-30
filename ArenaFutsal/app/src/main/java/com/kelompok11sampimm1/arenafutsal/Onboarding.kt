package com.kelompok11sampimm1.arenafutsal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

class Onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,HalamanAwal::class.java))
            finish()
        },2000)

        val mFragmentManager = supportFragmentManager
        val mFirstFragment = OnboardingFragment()
        val fragment = mFragmentManager.findFragmentByTag(OnboardingFragment::class.java.simpleName)
        if (fragment !is OnboardingFragment) {
            mFragmentManager
                .beginTransaction()
                .add(R.id.frame_container, mFirstFragment, OnboardingFragment::class.java.simpleName)
                .commit()
        }
    }
}