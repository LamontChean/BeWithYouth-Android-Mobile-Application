package com.lamont.assignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lamont.assignment.databinding.ActivityMainBinding
import com.lamont.assignment.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.registerButton.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.registerFragment)
//            val transaction = activity?.supportFragmentManager?.beginTransaction()
//            val fragment = RegisterFragment()
//            transaction?.replace(R.id.account_fragment, fragment)
//            transaction?.disallowAddToBackStack()
//            transaction?.commit()
        }


        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    companion object {

    }
}