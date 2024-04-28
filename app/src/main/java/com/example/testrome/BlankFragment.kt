package com.example.testrome

import TaskDatabase

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.testrome.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
lateinit var binding :FragmentBlankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =FragmentBlankBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      stratListener()
    }

    private fun stratListener() {
        binding.b1.setOnClickListener {
            startDatabase()

        }
    }

    private fun startDatabase() {
        //test in the
        try {


      val text1=  binding.tx1.text.toString()
        val text2 = binding.tx2.text.toString()
   TaskDatabase.getdatabase( requireContext()).taskDao().insert(Task(title = text1 , description = text2))

    }catch (e:Exception)
        {
            Log.e("", "startDatabase: e = ",e )
    }

    }


}