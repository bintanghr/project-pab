package com.example.aplikasikeuanganuns.ui.informasikeuangan

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = InformasiFragment()
        fragment.arguments = Bundle().apply {
            putInt(InformasiFragment.ARG_SECTION_NUMBER, position)
        }
        return fragment
    }
}