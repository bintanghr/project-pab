package com.example.administrasiuns.ui.penerimaan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class JenjangAdapter(
    private val jenjangList: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<JenjangAdapter.JenjangViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JenjangViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_jenjang, parent, false)
        return JenjangViewHolder(view)
    }

    override fun onBindViewHolder(holder: JenjangViewHolder, position: Int) {
        val jenjang = jenjangList[position]
        holder.bind(jenjang, onClick)
        // Set background color based on category
        when (jenjang) {
            "Vokasi" -> holder.itemView.setBackgroundResource(R.drawable.card_background_blue)
            "Sarjana" -> holder.itemView.setBackgroundResource(R.drawable.card_background_orange)
            "Pascasarjana" -> holder.itemView.setBackgroundResource(R.drawable.card_background_red)
            "Profesi" -> holder.itemView.setBackgroundResource(R.drawable.card_background_lightblue)
            "PPDS" -> holder.itemView.setBackgroundResource(R.drawable.card_background_darkred)
        }
    }

    override fun getItemCount() = jenjangList.size

    class JenjangViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textView: TextView = itemView.findViewById(R.id.jenjangTextView)

        fun bind(jenjang: String, onClick: (String) -> Unit) {
            textView.text = jenjang
            itemView.setOnClickListener { onClick(jenjang) }
        }
    }
}
