package com.example.administrasiuns.ui.layanan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class ListServiceAdapter(private val listService: ArrayList<Service>) :
    RecyclerView.Adapter<ListServiceAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imgPhoto: ImageView = itemView.findViewById(R.id.img_faculty_photo)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_faculty_major)
        val tvName: TextView = itemView.findViewById(R.id.tv_faculty_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_faculty, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listService.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (serviceName, cost, termsOfService, procedure, processingTime) = listService[position]
//        val majorText = "Rp $cost"
        holder.tvPrice.text = processingTime
        holder.tvName.text = serviceName
//        holder.imgPhoto.setImageResource(img)

        holder.itemView.setOnClickListener {
            val bundle = Bundle().apply {
                putString(DetailServiceFragment.EXTRA_NAME, serviceName)
                putString(DetailServiceFragment.EXTRA_COST, cost)
                putString(DetailServiceFragment.EXTRA_TERMS, termsOfService)
                putString(DetailServiceFragment.EXTRA_PROCEDURE, procedure)
                putString(DetailServiceFragment.EXTRA_TIME, processingTime)
//                putInt(DetailFacultyFragment.EXTRA_IMG, img)
//                putString(DetailFacultyFragment.EXTRA_URL, url)
            }
            holder.itemView.findNavController().navigate(R.id.action_serviceFragment_to_detailServiceFragment, bundle)
        }
    }
}