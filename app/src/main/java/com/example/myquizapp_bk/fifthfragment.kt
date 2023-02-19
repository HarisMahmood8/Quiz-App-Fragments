package com.example.myquizapp_bk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class fifthfragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_fifthfragment, container, false)
        val prevBtn : Button = view.findViewById(R.id.fifth)
        prevBtn.setOnClickListener {
            val fragment = FirstFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, fragment)?.commit()
        }
        val Truebuttn4 : Button = view.findViewById(R.id.buttontruefinl)
        Truebuttn4.setOnClickListener {
            val toast4t = Toast.makeText(this@fifthfragment.requireActivity(), "1. True\n2. False, Jupiter is the biggest planet in the solar system\n3. True", Toast.LENGTH_SHORT).show()
        }


        return view
    }

}