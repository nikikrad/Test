package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentLastBinding
import com.example.myapplication.databinding.FragmentNewBinding

class NewFragment:Fragment() {

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
            (activity as? MainActivity)?.openFragment(LastFragment())
        }

        binding?.tvName?.setOnEditorActionListener {

        }


    }



    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
