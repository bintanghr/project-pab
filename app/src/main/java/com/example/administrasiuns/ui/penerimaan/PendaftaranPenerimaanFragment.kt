package com.example.administrasiuns.ui.penerimaan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.administrasiuns.R
import com.example.administrasiuns.databinding.FragmentPendaftaranPenerimaanBinding

class PendaftaranPenerimaanFragment : Fragment() {

    private var _binding: FragmentPendaftaranPenerimaanBinding? = null
    private val binding get() = _binding!!

    private val jenjangList = listOf(
        "Vokasi", "Sarjana", "Pascasarjana", "Profesi", "PPDS"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPendaftaranPenerimaanBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup RecyclerView with adapter
        val adapter = JenjangAdapter(jenjangList) { jenjang ->
            navigateToFragment(jenjang)
        }
        binding.recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerView.adapter = adapter

        // Set click listener for "Lihat PDF" button
        binding.lihatPdfButton.setOnClickListener {
            openPdfLink()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun navigateToFragment(jenjang: String) {
        when (jenjang) {
            "Vokasi" -> findNavController().navigate(R.id.action_pendaftaranPenerimaanFragment_to_vokasiFragment)
            "Sarjana" -> findNavController().navigate(R.id.action_pendaftaranPenerimaanFragment_to_sarjanaFragment)
            "Pascasarjana" -> findNavController().navigate(R.id.action_pendaftaranPenerimaanFragment_to_pascasarjanaFragment)
            "Profesi" -> findNavController().navigate(R.id.action_pendaftaranPenerimaanFragment_to_profesiFragment)
            "PPDS" -> findNavController().navigate(R.id.action_pendaftaranPenerimaanFragment_to_ppdsFragment)
        }
    }

    private fun openPdfLink() {
        // Replace with your PDF URL
        val pdfUrl = "https://spmb.uns.ac.id/site/page-flip"

        // Create an intent to open the web link
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(pdfUrl))
        startActivity(intent)
    }
}
