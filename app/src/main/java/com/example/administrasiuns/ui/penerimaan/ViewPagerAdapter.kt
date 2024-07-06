package com.example.administrasiuns.ui.penerimaan

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PendaftaranPenerimaanFragment()
            1 -> AdministrasiAkademikFragment() // Assume this is already created
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}
