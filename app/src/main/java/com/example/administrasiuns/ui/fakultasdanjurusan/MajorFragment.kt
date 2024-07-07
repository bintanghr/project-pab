package com.example.administrasiuns.ui.fakultasdanjurusan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.administrasiuns.R

class MajorFragment : Fragment() {
    private lateinit var rvMajor: RecyclerView
    private val list = ArrayList<Major>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView : View = inflater.inflate(R.layout.fragment_major, container, false)

        rvMajor = rootView.findViewById(R.id.rv_major)
        rvMajor.setHasFixedSize(true)
        list.addAll(getMajorList())
        showRecyclerList()

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val dataMajor = it.getString(EXTRA_MAJOR)

        }
    }

    private fun getMajorList() : ArrayList<Major> {
        lateinit var dataList : List<String>
        val majorList = ArrayList<Major>()
        arguments?.let {
            val dataMajor = it.getString(EXTRA_MAJOR)
            if (dataMajor !== null) {
                dataList = dataMajor.split(", ")
            }

            for (i in dataList.indices) {
                val major = Major(dataList[i])
                majorList.add(major)
            }
        }

        return majorList
    }

    private fun showRecyclerList() {
        rvMajor.layoutManager = LinearLayoutManager(requireContext())
        val listCatAdapter = ListMajorAdapter(list)
        rvMajor.adapter = listCatAdapter
    }

    companion object {
        const val EXTRA_MAJOR = "extra_major"
    }
}