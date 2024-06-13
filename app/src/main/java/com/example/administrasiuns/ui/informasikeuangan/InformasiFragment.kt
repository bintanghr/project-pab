package com.example.aplikasikeuanganuns.ui.informasikeuangan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R
import com.example.coffeeordering.ui.menu.Informasi

class InformasiFragment : Fragment() {
    private lateinit var rvInformasi: RecyclerView
    private val list = ArrayList<Informasi>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView : View = inflater.inflate(R.layout.fragment_informasi, container, false)

        rvInformasi = rootView.findViewById(R.id.rv_informasi)
        rvInformasi.setHasFixedSize(true)
        list.addAll(getInformasiPemasukanList())
        showRecyclerList()

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        when (arguments?.getInt(ARG_SECTION_NUMBER, 0)) {
            0 -> {
                list.clear()
                list.addAll(getInformasiPemasukanList())
                showRecyclerList()
            }
            1 -> {
                list.clear()
                list.addAll(getInformasiPengeluaranList())
                showRecyclerList()
            }
        }
    }

    private fun getInformasiPemasukanList() : ArrayList<Informasi> {
        val dataName = resources.getStringArray(R.array.nama_informasi_pemasukan)
        val dataPrice = resources.getStringArray(R.array.nominal_pemasukan)
        val dataDesc = resources.getStringArray(R.array.deskripsi_pemasukan)
//        val dataImg = resources.obtainTypedArray(R.array.food_img)
        val menuList = ArrayList<Informasi>()
        for (i in dataName.indices) {
            val menu = Informasi(dataName[i], dataPrice[i], dataDesc[i])
            menuList.add(menu)
        }
        return menuList
    }
    private fun getInformasiPengeluaranList() : ArrayList<Informasi> {
        val dataName = resources.getStringArray(R.array.nama_informasi_pengeluaran)
        val dataPrice = resources.getStringArray(R.array.nominal_pengeluaran)
        val dataDesc = resources.getStringArray(R.array.deskripsi_pengeluaran)
//        val dataImg = resources.obtainTypedArray(R.array.food_img)
        val menuList = ArrayList<Informasi>()
        for (i in dataName.indices) {
            val menu = Informasi(dataName[i], dataPrice[i], dataDesc[i])
            menuList.add(menu)
        }
        return menuList
    }
    private fun showRecyclerList() {
        rvInformasi.layoutManager = LinearLayoutManager(requireContext())
        val listCatAdapter = ListInformasiAdapter(list)
        rvInformasi.adapter = listCatAdapter
    }

    companion object {
        const val ARG_SECTION_NUMBER = "section_number"
    }
}