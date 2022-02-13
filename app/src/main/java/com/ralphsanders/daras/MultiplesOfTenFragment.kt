package com.ralphsanders.daras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ralphsanders.daras.databinding.FragmentMultiplesOfTenBinding
import com.ralphsanders.daras.databinding.FragmentOneToTwentyBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class MultiplesOfTenFragment : Fragment() {

    private var _binding: FragmentMultiplesOfTenBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMultiplesOfTenBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}