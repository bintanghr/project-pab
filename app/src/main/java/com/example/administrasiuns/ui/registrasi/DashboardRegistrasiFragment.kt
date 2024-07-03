package com.example.administrasiuns.ui.registrasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import com.example.administrasiuns.R
import com.example.administrasiuns.databinding.FragmentDashboardRegistrasiBinding

class DashboardRegistrasiFragment : Fragment() {
    private var _binding: FragmentDashboardRegistrasiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDashboardRegistrasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cardWaktuPendaftaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_registrationFragment_to_detailRegistrationScheduleFragment)
        }

        binding.cardSyaratPendaftaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_registrationFragment_to_detailRegistrationTermsFragment)
        }

        binding.cardCaraPendaftaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_registrationFragment_to_detailRegistrationProcedureFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
