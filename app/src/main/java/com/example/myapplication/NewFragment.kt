package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentNewBinding

class NewFragment:Fragment() {

    private lateinit var textView: TextView

    private var binding: FragmentNewBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewBinding.inflate(inflater,container,false)
        return binding?.root
//        return inflater.inflate(R.layout.fragment_new, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

//        textView = view.findViewById(R.id.tvHelloWorld)
        val FIO: String = "Skurak Penis"
        binding!!.tvHelloWorld.text = FIO

    }



    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
