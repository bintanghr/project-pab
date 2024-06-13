package com.example.aplikasikeuanganuns.ui.fakultasdanjurusan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class ListFacultyAdapter(private val listMenu: ArrayList<Faculty>) :
    RecyclerView.Adapter<ListFacultyAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_faculty_major)
        val tvName: TextView = itemView.findViewById(R.id.tv_faculty_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_faculty, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMenu.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (namaInformasi, nominal, deskripsi) = listMenu[position]
        val majorText = "$nominal Program Studi"
        holder.tvPrice.text = majorText
        holder.tvName.text = namaInformasi

//        holder.itemView.setOnClickListener {
//            val bundle = Bundle().apply {
//                putString(DetailInformasiFragment.EXTRA_NAME, name)
//                putString(DetailInformasiFragment.EXTRA_PRICE, price)
//                putString(DetailInformasiFragment.EXTRA_DESC, desc)
//                putInt(DetailInformasiFragment.EXTRA_IMG, img)
//            }
//            holder.itemView.findNavController().navigate(R.id.action_menuFragment_to_detailMenuFragment, bundle)
//        }
    }
}