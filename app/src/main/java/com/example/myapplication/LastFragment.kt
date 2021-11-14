package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentLastBinding

class LastFragment: Fragment() {

    private var binding: FragmentLastBinding? = null
    private var newBinding: ActivityMainBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLastBinding.inflate(inflater,container,false)
        return binding?.root
    }

//    val newContainer = newBinding?.container не использовать

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {



        val workerList = listOf(
            Worker("Nikitos", "Shurikov"),
            Worker("Oleg", "Shurikov"),
            Worker("Djimichu", "Shurikov"),
            Worker("Anton", "Shurikov"),
            Worker("CJ", "Shurikov"),
            Worker("Nikitos", "Kopatich"),
            Worker("Den", "Shurikov"),
            Worker("Artem", "Shurikov"),
            Worker("Max", "Shurikov"),
            Worker("Nikitos", "Sinyaga"),
            Worker("Nikitos", "Skurach"),
            Worker("Nikitos", "Maruev"),

            )

        val workersAdapter = WorkersAdapter(workerList)
        binding?.rvWorkers?.layoutManager = LinearLayoutManager(activity?.applicationContext, LinearLayoutManager.VERTICAL, false)
        binding?.rvWorkers?.adapter = workersAdapter



//        binding?.btnAdd?.setOnClickListener {не использовать
//            openFragment(NewFragment())
//        }


    }
//    fun openFragment(fragment: Fragment){не использовать
//        newContainer?.id?.let {
//            childFragmentManager.beginTransaction()
//                .replace(it, fragment)
//                .addToBackStack(null)
//                .commit()
//        }
//    }



    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}