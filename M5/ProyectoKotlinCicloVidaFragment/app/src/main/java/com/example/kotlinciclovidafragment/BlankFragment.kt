package com.example.kotlinciclovidafragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {
    var contador = 0

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("Fragment", "onAttach")
        contador++
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment", "onCreate")
        contador++
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Fragment", "onCreateView")
        contador++
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment", "onActivityCreated")
        contador++
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment", "onStart")
        contador++
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment", "onResume")
        contador++
        Log.i("Fragment", "Contador: $contador")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment", "onPause")
        contador++
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment", "onStop")
        contador++
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment", "onDestroyView")
        contador++
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment", "onDestroy")
        contador++
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment", "onDetach")
        contador++
        Log.i("Fragment", "Contador: $contador")
    }

}