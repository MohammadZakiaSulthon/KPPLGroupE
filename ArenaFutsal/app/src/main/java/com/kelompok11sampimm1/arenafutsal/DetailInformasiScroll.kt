package com.kelompok11sampimm1.arenafutsal

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.kelompok11sampimm1.arenafutsal.model.DetailInformasiModel
import kotlinx.android.synthetic.main.activity_detail_informasi_scroll.*

class DetailInformasiScroll : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_informasi_scroll)

        val data = intent.getParcelableExtra<DetailInformasiModel>("extra")
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = data?.title
        tvDesc.text = data?.desc

        Glide.with(this)
            .load(data?.photo)
            .into(ivDetail)

    }
}