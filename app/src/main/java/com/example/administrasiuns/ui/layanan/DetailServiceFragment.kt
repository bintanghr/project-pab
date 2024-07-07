package com.example.administrasiuns.ui.layanan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class DetailServiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_service, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvServiceName : TextView = view.findViewById(R.id.tv_service_name)
        val tvCost : TextView = view.findViewById(R.id.tv_cost)
        val tvTime : TextView = view.findViewById(R.id.tv_time)
//        val btnWebsite : Button = view.findViewById(R.id.btn_website)
//        var websiteUrl = ""

        arguments?.let {
            val serviceName = it.getString(EXTRA_NAME)
            val cost = it.getString(EXTRA_COST)
            val terms = it.getString(EXTRA_TERMS)
            val procedure = it.getString(EXTRA_PROCEDURE)
            val time = it.getString(EXTRA_TIME)

            tvServiceName.text = serviceName
            tvCost.text = cost
            tvTime.text = time
//            websiteUrl = "https://$procedure.uns.ac.id/"

            if (arguments !== null) {
                val mainItems = listOf(
                    MainItem("Syarat", terms),
                    MainItem("Prosedur", procedure)
                )

                val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
                recyclerView.layoutManager = LinearLayoutManager(context)
                recyclerView.adapter = MainAdapter(mainItems)
            }
        }

//        btnWebsite.setOnClickListener {
//            val websiteIntent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
//            startActivity(websiteIntent)
//        }
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_COST = "extra_cost"
        const val EXTRA_TERMS = "extra_terms"
        const val EXTRA_PROCEDURE = "extra_procedure"
        const val EXTRA_TIME = "extra_time"
    }
}