package com.example.administrasiuns.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.administrasiuns.R
import com.example.administrasiuns.ui.registrasi.DashboardRegistrasiFragment

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, DashboardRegistrasiFragment())
                .commitNow()
        }
    }
}
