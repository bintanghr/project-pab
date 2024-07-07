package com.example.administrasiuns.ui.penerimaan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class ProgramAdapter : RecyclerView.Adapter<ProgramAdapter.ProgramViewHolder>() {

    private var programList: List<Program> = emptyList()

    class ProgramViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nomor: TextView = itemView.findViewById(R.id.nomor)
        private val namaProdi: TextView = itemView.findViewById(R.id.namaProdi)
        private val jenjang: TextView = itemView.findViewById(R.id.jenjang)
        private val akreditasi: TextView = itemView.findViewById(R.id.akreditasi)
        private val akreditasiInternasional: TextView = itemView.findViewById(R.id.akreditasiInternasional)
        private val dayaTampung: TextView = itemView.findViewById(R.id.dayaTampung)

        fun bind(program: Program, position: Int) {
            nomor.text = (position + 1).toString()
            namaProdi.text = program.NamaProdi
            jenjang.text = program.Jenjang
            akreditasi.text = program.Akreditasi
            akreditasiInternasional.text = program.AkreditasiInternasional
            dayaTampung.text = program.DayaTampung
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgramViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_program, parent, false)
        return ProgramViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProgramViewHolder, position: Int) {
        holder.bind(programList[position], position)
    }

    override fun getItemCount(): Int {
        return programList.size
    }

    fun submitList(programs: List<Program>) {
        programList = programs
        notifyDataSetChanged()
    }
}
