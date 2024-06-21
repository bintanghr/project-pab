package com.example.administrasiuns.ui.fakultasdanjurusan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.administrasiuns.R


class DetailFacultyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_faculty, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imgFaculty : ImageView = view.findViewById(R.id.img_faculty)
        val tvFacultyName : TextView = view.findViewById(R.id.tv_faculty_name)
        val tvTotalMajor : TextView = view.findViewById(R.id.tv_total_major)
        val tvFacultyDesc : TextView = view.findViewById(R.id.tv_faculty_desc)

        arguments?.let {
            val img = it.getInt(EXTRA_IMG, 0)
            val facultyName = it.getString(EXTRA_NAME)
            val totalMajor = it.getString(EXTRA_TOTAL_MAJOR)
            val facultyDesc = it.getString(EXTRA_DESC)
            val totalMajorText = "$totalMajor jurusan   "

            imgFaculty.setImageResource(img)
            tvTotalMajor.text = totalMajorText
            tvFacultyName.text = facultyName
            tvFacultyDesc.text = facultyDesc
        }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_TOTAL_MAJOR = "extra_total"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
    }
}