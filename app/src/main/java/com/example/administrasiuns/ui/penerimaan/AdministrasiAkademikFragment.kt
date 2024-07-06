package com.example.administrasiuns.ui.penerimaan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class AdministrasiAkademikFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_administrasi_akademik, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mainItems = listOf(
            MainItem("Registrasi", listOf(
                SubItem("Registrasi", "https://siakad.uns.ac.id/registrasi/biodata/cek-pin"),
                SubItem("Biodata", "https://siakad.uns.ac.id/registrasi/biodata/view"),
                SubItem("Tagihan", "https://siakad.uns.ac.id/registrasi/cek/tagihan")
            )),
            MainItem("Bimbingan Akademik", listOf(
                SubItem("Bimbingan Akademik", "https://siakad.uns.ac.id/konsultasi/bimbingan-akademik/index"),
                SubItem("Bimbingan TA/Thesis/Skripsi", "https://siakad.uns.ac.id/konsultasi/ta-skripsi/daftar-pembimbing")
            )),
            MainItem("KRS", listOf(
                SubItem("KRS Reguler", "https://siakad.uns.ac.id/registrasi/biodata/cek-pin-krs"),
                SubItem("KRS MBKM", "https://siakad.uns.ac.id/registrasi/biodata/cek-pin-krs"),
                SubItem("Cetak KRS", "https://siakad.uns.ac.id/krs/index")
            )),
            MainItem("KHS", listOf(
                SubItem("Cek Nilai", "https://siakad.uns.ac.id/nilai/index")
            ))
        )

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = MainAdapter(mainItems)
    }
}
