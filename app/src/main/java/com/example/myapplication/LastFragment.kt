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
    var bundle: Bundle? = this.arguments
    lateinit var Name: String
    lateinit var Surname: String

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

        Name = bundle?.getString(Name, toString()) ?: ""

        var workerList = listOf(Worker())


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