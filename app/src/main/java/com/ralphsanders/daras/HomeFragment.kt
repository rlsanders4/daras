package com.ralphsanders.daras

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ralphsanders.daras.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLetterForms.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_LetterFormsFragment)
        }
        binding.buttonLetterSounds.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_LetterSoundsFragment)
        }
        binding.buttonOneToTwenty.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_OneToTwentyFragment)
        }
        binding.buttonMultiplesOfTen.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_MultiplesOfTenFragment)
        }
        binding.buttonOrdinalNumbers.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_OrdinalNumbersFragment)
        }
        binding.buttonPersonalPronouns.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_PersonalPronounsFragment)
        }
        binding.buttonAttachedPronouns.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_AttachedPronounsFragment)
        }
        binding.buttonPresentTenseVerbs.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_PresentTenseVerbsFragment)
        }
        binding.buttonPastTenseVerbs.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_PastTenseVerbsFragment)
        }
        binding.buttonVerbForms.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_VerbFormsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}