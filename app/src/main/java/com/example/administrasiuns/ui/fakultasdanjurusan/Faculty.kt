package com.example.aplikasikeuanganuns.ui.fakultasdanjurusan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Faculty(
    val namaInformasi: String,
    val nominal: String,
    val deskripsi: String,
    val img: Int,
    val url: String
) : Parcelable
