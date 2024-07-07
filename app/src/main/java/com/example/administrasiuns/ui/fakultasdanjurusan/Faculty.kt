package com.example.administrasiuns.ui.fakultasdanjurusan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Faculty(
    val facultyName: String,
    val totalMajor: String,
    val desc: String,
    val img: Int,
    val url: String,
    val major: String
) : Parcelable
