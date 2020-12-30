package com.kelompok11sampimm1.arenafutsal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.kelompok11sampimm1.arenafutsal.adapter.DetailInformasiAdapter
import com.kelompok11sampimm1.arenafutsal.model.DetailInformasiModel
import kotlinx.android.synthetic.main.activity_detail_informasi.*

class DetailInformasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_informasi)

        val adapter = DetailInformasiAdapter(getDataDetail(), this)
        rvDetail.adapter = adapter
        rvDetail.layoutManager = LinearLayoutManager(this)

        btnBack.setOnClickListener {
            finish()
        }
    }

    fun getDataDetail(): ArrayList<DetailInformasiModel> {
        val list = arrayListOf<DetailInformasiModel>()
        list.add(
            DetailInformasiModel(
                "Sejarah Futsal di Dunia",
                "Pada mulanya, futsal dipopulerkan oleh Juan Carlos Ceriani pada tahun 1930 di Montevideo, Uruguay. Olahraga ini kemudian berkembang ke daerah Amerika Selatan, terutama di Brasil. Banyak bintang sepakbola Brasil mengasah kemampuan mereka lewat olahraga ini, Pele salah satunya. Sekarang ini, futsal dimainkan di bawah perlindungan Fédération Internationale de Football Association (FIFA) di seluruh dunia.\n" +
                        "Olahraga futsal memang terlihat sedikit mirip dengan olahraga Sepak Bola. Kedua olahraga ini terlihat mirip karena sama-sama jenis olahraga yang menggunakan bola besar. Namun, futsal dirasa lebih fleksibel daripada sepak bola. Selain perbedaan jumlah pemain, ukuran lapangan dan berat bola futsal juga berbeda dengan sepak bola. Pada olahraga sepak bola, dibutuhkan lapangan dengan panjang 90-120 meter dan lebar 45-90 meter.\n" +
                        "Sedangkan untuk olahraga futsal, hanya dibutuhkan lapangan dengan panjang sekitar 25-42 meter dan lebar 15-25 meter. Berat bola yang digunakan pada olahraga sepak bola adalah 396-453 gram, sedangkan pada futsal 400-440 gram. Waktu pertandingan juga berbeda. Jika pada sepak bola waktu pertandingan adalah 2 x 45 menit, olahraga futsal hanya butuh 2 x 20 menit saja. Hanya dengan lima orang per tim, kamu sudah bisa bermain futsal.",
                "https://images.unsplash.com/photo-1587384474964-3a06ce1ce699?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=750&q=80"
            )
        )
        list.add(
            DetailInformasiModel(
                "Sejarah Futsal di Indonesia",
                "Sejak tahun 1998-1999, futsal sudah dikenal di Indonesia. Namun, sejarah futsal di Indonesia resmi diawali sejak tahun 2002. Indonesia ditunjuk untuk menjadi tuan rumah oleh Asian Football Confederation (AFC) dalam penyelenggaraan putaran final kejuaraan futsal tingkat Asia di Jakarta. Putaran kejuaraan futsal tingkat Asia ini diselenggarakan pada tanggal 22 – 30 Oktober 2002. \n+" +
                        " Nama Justinus Lhaksana tidak lepas dari sejarah futsal di Indonesia. Ia berjasa dalam membawa dan mengembangkan olahraga ini di Indonesia. Bersama almarhum Adjie Massaid, ia mendirikan Tifosi AMFC pada tahun 2003. Sempat tinggal di Belanda, coach JL (biasa ia dipanggil), memiliki sertifikat kepelatihan futsal dari Asosiasi Sepakbola Belanda.",
                "https://images.unsplash.com/photo-1536122985607-4fe00b283652?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&auto=format&fit=crop&w=805&q=80"
            )
        )
        return list
    }

}