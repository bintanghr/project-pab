package com.example.administrasiuns.ui.fakultasdanjurusan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
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
        val btnWebsite : Button = view.findViewById(R.id.btn_website)
        var websiteUrl = ""

        arguments?.let {
            val img = it.getInt(EXTRA_IMG, 0)
            val facultyName = it.getString(EXTRA_NAME)
            val totalMajor = it.getString(EXTRA_TOTAL_MAJOR)
            val facultyDesc = it.getString(EXTRA_DESC)
            val url = it.getString(EXTRA_URL)
            val totalMajorText = "$totalMajor jurusan "

            imgFaculty.setImageResource(img)
            tvTotalMajor.text = totalMajorText
            tvFacultyName.text = facultyName
            tvFacultyDesc.text = facultyDesc
            websiteUrl = "https://$url.uns.ac.id/"
        }

        btnWebsite.setOnClickListener {
            val websiteIntent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
            startActivity(websiteIntent)
        }
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_TOTAL_MAJOR = "extra_total"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_URL = "extra_url"
    }
}