package com.example.aplikasikeuanganuns.ui.informasikeuangan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.administrasiuns.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator




class InformasiKeuanganFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView : View = inflater.inflate(R.layout.fragment_informasi_keuangan, container, false)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager: ViewPager2 = rootView.findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = rootView.findViewById(R.id.tabs)
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = TAB_TITLES[position]
        }.attach()

        return rootView
    }

    companion object {
        private val TAB_TITLES = arrayListOf(
            "Pemasukan",
            "Pengeluaran"
        )
    }
}