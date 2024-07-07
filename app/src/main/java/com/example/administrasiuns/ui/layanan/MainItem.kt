package com.example.administrasiuns.ui.layanan

data class MainItem(
    val title: String,
    val subItems: String?,
    var isExpanded: Boolean = false
)

data class SubItem(
    val title: String,
    val url: String
)
