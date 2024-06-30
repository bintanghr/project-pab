package com.example.administrasiuns.ui.layanan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Service(
    val serviceName: String,
    val cost: String,
    val termsOfService: String,
    val procedure: String,
    val processingTime: String,
//    val img: Int,
//    val url: String
) : Parcelable
