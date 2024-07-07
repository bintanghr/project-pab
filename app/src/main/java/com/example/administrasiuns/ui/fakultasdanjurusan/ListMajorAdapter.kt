package com.example.administrasiuns.ui.fakultasdanjurusan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R
import com.example.administrasiuns.ui.fakultasdanjurusan.DetailFacultyFragment

class ListMajorAdapter(private val listMenu: ArrayList<Major>) :
    RecyclerView.Adapter<ListMajorAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.itemTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_main_service, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMenu.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (majorName) = listMenu[position]
        holder.tvName.text = majorName
    }
}