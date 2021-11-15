package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.LastFragment.Companion.NAME
import com.example.myapplication.LastFragment.Companion.SURNAME
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentLastBinding
import com.example.myapplication.databinding.FragmentNewBinding
import java.util.jar.Attributes
import com.example.myapplication.NewFragment.OnFragmentChangedListener
import java.lang.ClassCastException


class NewFragment:Fragment() {

    lateinit var name: String
    lateinit var surname: String
    lateinit var fragment: Fragment
    lateinit var bundle: Bundle

    private var binding: FragmentNewBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewBinding.inflate(inflater,container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding?.btn?.setOnClickListener {
            name = binding?.tvName?.text.toString()
            surname = binding?.tvSurname?.text.toString()
            bundle.putString(NAME, name)
            bundle.putString(SURNAME, surname)
            fragment.arguments = bundle
//            name.getText().toString()
//            surname.getText().toString()
            (activity as? MainActivity)?.openFragment(LastFragment())
        }

        binding!!.btnTest.setOnClickListener {
            name = binding?.tvName?.text.toString()
            binding!!.tvTest.text = name
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
