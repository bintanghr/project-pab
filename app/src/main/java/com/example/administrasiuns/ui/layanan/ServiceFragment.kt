package com.example.administrasiuns.ui.layanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class ServiceFragment : Fragment() {
    private lateinit var rvService: RecyclerView
    private val list = ArrayList<Service>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView : View = inflater.inflate(R.layout.fragment_service, container, false)

        rvService = rootView.findViewById(R.id.rv_service)
        rvService.setHasFixedSize(true)
        list.addAll(getServiceList())
        showRecyclerList()

        return rootView
    }

    private fun getServiceList() : ArrayList<Service> {
        val dataName = resources.getStringArray(R.array.service_name)
        val dataCost = resources.getStringArray(R.array.service_cost)
        val dataTerms = resources.getStringArray(R.array.service_terms)
        val dataProcedure = resources.getStringArray(R.array.service_procedure)
        val dataTime = resources.getStringArray(R.array.service_time)
        val serviceList = ArrayList<Service>()
        for (i in dataName.indices) {
            val service = Service(dataName[i], dataCost[i], dataTerms[i], dataProcedure[i], dataTime[i])
            serviceList.add(service)
        }
        return serviceList
    }

    private fun showRecyclerList() {
        rvService.layoutManager = LinearLayoutManager(requireContext())
        val listCatAdapter = ListServiceAdapter(list)
        rvService.adapter = listCatAdapter
    }
}