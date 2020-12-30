package com.kelompok11sampimm1.arenafutsal.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DetailInformasiModel(
    val title: String,
    val desc: String,
    val photo: String
) : Parcelable