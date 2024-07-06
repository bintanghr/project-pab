package com.example.administrasiuns.ui.penerimaan

data class MainItem(
    val title: String,
    val subItems: List<SubItem>,
    var isExpanded: Boolean = false
)

data class SubItem(
    val title: String,
    val url: String
)
