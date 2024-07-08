package com.example.administrasiuns.ui.penerimaan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class VokasiFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var programAdapter: ProgramAdapter
    private val firebaseService = FirebaseService()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_vokasi, container, false)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        programAdapter = ProgramAdapter()
        recyclerView.adapter = programAdapter

        firebaseService.getProdiData { vokasi, sarjana, pascasarjana, profesi, ppds ->
            val allPrograms = vokasi
            programAdapter.submitList(allPrograms)
        }

        return view
    }
}
