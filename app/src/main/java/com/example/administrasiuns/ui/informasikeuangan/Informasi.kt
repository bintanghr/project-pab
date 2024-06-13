package com.example.coffeeordering.ui.menu

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Informasi(
    val namaInformasi: String,
    val nominal: String,
    val deskripsi: String
) : Parcelable
