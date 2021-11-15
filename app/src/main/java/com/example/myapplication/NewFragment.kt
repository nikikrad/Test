package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentLastBinding
import com.example.myapplication.databinding.FragmentNewBinding
import java.util.jar.Attributes

abstract class NewFragment:Fragment() {

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
            name = binding?.tvName?.getText().toString()
            binding?.tvSurname?.getText().toString()
            bundle.putString(name, toString())
            bundle.putString(surname, toString())
            fragment.arguments = bundle
//            name.getText().toString()
//            surname.getText().toString()
            (activity as? MainActivity)?.openFragment(LastFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
