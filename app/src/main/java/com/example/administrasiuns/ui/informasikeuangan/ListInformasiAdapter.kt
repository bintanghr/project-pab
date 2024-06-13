package com.example.aplikasikeuanganuns.ui.informasikeuangan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R
import com.example.coffeeordering.ui.menu.Informasi

class ListInformasiAdapter(private val listMenu: ArrayList<Informasi>) :
    RecyclerView.Adapter<ListInformasiAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_informasi, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listMenu.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (namaInformasi, nominal, deskripsi) = listMenu[position]
        val priceText = "Rp $nominal"
        holder.tvPrice.text = priceText
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