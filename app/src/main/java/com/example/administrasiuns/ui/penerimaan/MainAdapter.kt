package com.example.administrasiuns.ui.penerimaan

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class MainAdapter(
    private val mainItems: List<MainItem>
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(mainItems[position])
    }

    override fun getItemCount(): Int = mainItems.size

    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val cardView: CardView = itemView.findViewById(R.id.cardView)
        private val title: TextView = itemView.findViewById(R.id.itemTitle)
        private val subItemLayout: LinearLayout = itemView.findViewById(R.id.subItemLayout)
        private val subItemsContainer: LinearLayout = itemView.findViewById(R.id.subItemsContainer)

        fun bind(mainItem: MainItem) {
            title.text = mainItem.title

            // Set up sub-items
            subItemsContainer.removeAllViews()
            for (subItem in mainItem.subItems) {
                val subItemView = LayoutInflater.from(itemView.context)
                    .inflate(R.layout.item_sub, subItemsContainer, false)

                val subItemIcon = subItemView.findViewById<ImageView>(R.id.subItemIcon)
                val subItemText = subItemView.findViewById<TextView>(R.id.subItemText)

                subItemText.text = subItem.title
                subItemIcon.setImageResource(getIconResource(adapterPosition, mainItem.subItems.indexOf(subItem)))

                subItemText.setOnClickListener {
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(subItem.url))
                    itemView.context.startActivity(browserIntent)
                }

                subItemsContainer.addView(subItemView)
            }

            subItemLayout.visibility = if (mainItem.isExpanded) View.VISIBLE else View.GONE

            itemView.setOnClickListener {
                mainItem.isExpanded = !mainItem.isExpanded
                notifyItemChanged(adapterPosition)
            }
        }

        private fun getIconResource(mainPosition: Int, subPosition: Int): Int {
            return when (mainPosition * 3 + subPosition) {
                0 -> R.drawable.ic_registrasi
                1 -> R.drawable.ic_biodata
                2 -> R.drawable.ic_tagihan
                3 -> R.drawable.ic_bimbingan
                4 -> R.drawable.ic_bimbingan
                5 -> R.drawable.ic_krs
                6 -> R.drawable.ic_krs
                7 -> R.drawable.ic_krs
                8 -> R.drawable.ic_cetakkrs
                9 -> R.drawable.ic_khs
                else -> R.drawable.ic_launcher_background
            }
        }
    }
}
