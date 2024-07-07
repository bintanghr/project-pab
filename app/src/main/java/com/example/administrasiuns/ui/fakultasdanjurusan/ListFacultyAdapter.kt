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

class ListFacultyAdapter(private val listMenu: ArrayList<Faculty>) :
    RecyclerView.Adapter<ListFacultyAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_faculty_photo)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_faculty_major)
        val tvName: TextView = itemView.findViewById(R.id.tv_faculty_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_faculty, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMenu.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (facultyName, totalMajor, desc, img, url, major) = listMenu[position]
        val majorText = "$totalMajor Program Studi"
        holder.tvPrice.text = majorText
        holder.tvName.text = facultyName
        holder.imgPhoto.setImageResource(img)

        holder.itemView.setOnClickListener {
            val bundle = Bundle().apply {
                putString(DetailFacultyFragment.EXTRA_NAME, facultyName)
                putString(DetailFacultyFragment.EXTRA_TOTAL_MAJOR, totalMajor)
                putString(DetailFacultyFragment.EXTRA_DESC, desc)
                putInt(DetailFacultyFragment.EXTRA_IMG, img)
                putString(DetailFacultyFragment.EXTRA_URL, url)
                putString(DetailFacultyFragment.EXTRA_MAJOR, major)
            }
            holder.itemView.findNavController().navigate(R.id.action_facultyFragment_to_detailFacultyFragment, bundle)
        }
    }
}