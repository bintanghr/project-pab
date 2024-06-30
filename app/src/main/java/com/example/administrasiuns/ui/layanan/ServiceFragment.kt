package com.example.administrasiuns.ui.layanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R
import com.example.aplikasikeuanganuns.ui.fakultasdanjurusan.Faculty
import com.example.aplikasikeuanganuns.ui.fakultasdanjurusan.ListFacultyAdapter

class ServiceFragment : Fragment() {
    private lateinit var rvFaculty: RecyclerView
    private val list = ArrayList<Service>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView : View = inflater.inflate(R.layout.fragment_faculty, container, false)

        rvFaculty = rootView.findViewById(R.id.rv_faculty)
        rvFaculty.setHasFixedSize(true)
        list.addAll(getInformasiPemasukanList())
        showRecyclerList()

        return rootView
    }

    private fun getInformasiPemasukanList() : ArrayList<Service> {
        val dataName = resources.getStringArray(R.array.service_name)
        val dataCost = resources.getStringArray(R.array.service_cost)
        val dataTerms = resources.getStringArray(R.array.service_terms)
        val dataProcedure = resources.getStringArray(R.array.service_procedure)
        val dataTime = resources.getStringArray(R.array.service_time)
        val facultyList = ArrayList<Service>()
        for (i in dataName.indices) {
            val faculty = Service(dataName[i], dataCost[i], dataTerms[i], dataProcedure[i], dataTime[i])
            facultyList.add(faculty)
        }
        return facultyList
    }

    private fun showRecyclerList() {
        rvFaculty.layoutManager = LinearLayoutManager(requireContext())
        val listCatAdapter = ListFacultyAdapter(list)
        rvFaculty.adapter = listCatAdapter
    }
}