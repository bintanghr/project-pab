package com.example.aplikasikeuanganuns.ui.fakultasdanjurusan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class FacultyFragment : Fragment() {
    private lateinit var rvFaculty: RecyclerView
    private val list = ArrayList<Faculty>()

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

    private fun getInformasiPemasukanList() : ArrayList<Faculty> {
        val dataName = resources.getStringArray(R.array.faculty_name)
        val dataTotalMajor = resources.getStringArray(R.array.total_major)
        val dataDesc = resources.getStringArray(R.array.faculty_description)
        val dataImg = resources.obtainTypedArray(R.array.faculty_img)
        val dataUrl = resources.getStringArray(R.array.faculty_url)
        val facultyList = ArrayList<Faculty>()
        for (i in dataName.indices) {
            val faculty = Faculty(dataName[i], dataTotalMajor[i], dataDesc[i], dataImg.getResourceId(i, -1), dataUrl[i])
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