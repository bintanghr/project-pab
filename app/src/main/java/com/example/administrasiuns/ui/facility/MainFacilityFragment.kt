package com.example.administrasiuns.ui.facility

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.navigation.findNavController
import com.example.administrasiuns.R
import com.example.administrasiuns.ui.fakultasdanjurusan.DetailFacultyFragment


class MainFacilityFragment : Fragment() {
    val facilities = arrayOf(
        "Perpustakaan",
        "Asrama Mahasiswa",
        "Olahraga",
        "Medical Centre",
        "UNS Inn",
        "Tempat Ibadah",
        "Hotspot Area",
        "Transportasi Kampus",
        "UNS Press"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView : View = inflater.inflate(R.layout.fragment_main_facility, container, false)

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listView = view.findViewById<ListView>(R.id.listViewFacilities)
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, facilities)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, it, position, _ ->
            val facility = facilities[position]

            val bundle = Bundle().apply {
                putString(DetailFacilityFragment.EXTRA_FACILITY, facility)
            }
            it.findNavController().navigate(R.id.action_facilityFragment_to_detailFacilityFragment, bundle)
        }

    }
}