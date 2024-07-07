package com.example.administrasiuns.ui.penerimaan


import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObjects

class FirebaseService {
    private val db = FirebaseFirestore.getInstance()

    fun getProdiData(callback: (List<Program>, List<Program>, List<Program>, List<Program>, List<Program>) -> Unit) {
        db.collection("Prodi").document("Tabel").get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val vokasi = document.get("Vokasi") as List<Map<String, String>>
                    val sarjana = document.get("Sarjana") as List<Map<String, String>>
                    val pascasarjana = document.get("Pascasarjana") as List<Map<String, String>>
                    val profesi = document.get("Profesi") as List<Map<String, String>>
                    val ppds = document.get("PPDS") as List<Map<String, String>>

                    val vokasiList = vokasi.map { it.toProgram() }
                    val sarjanaList = sarjana.map { it.toProgram() }
                    val pascasarjanaList = pascasarjana.map { it.toProgram() }
                    val profesiList = profesi.map { it.toProgram() }
                    val ppdsList = ppds.map { it.toProgram() }

                    callback(vokasiList, sarjanaList, pascasarjanaList, profesiList, ppdsList)
                }
            }
    }

    private fun Map<String, String>.toProgram(): Program {
        return Program(
            NamaProdi = this["Nama Prodi"] ?: "",
            Jenjang = this["Jenjang"] ?: "",
            Akreditasi = this["Akreditasi"] ?: "",
            AkreditasiInternasional = this["Akreditasi Internasional"] ?: "",
            DayaTampung = this["Daya Tampung"] ?: ""
        )
    }
}
