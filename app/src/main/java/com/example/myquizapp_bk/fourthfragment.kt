package com.example.myquizapp_bk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class fourthfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_fourthfragment, container, false)
        val prevBtn : Button = view.findViewById(R.id.fourth)
        prevBtn.setOnClickListener {
            val fragment = fifthfragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, fragment)?.commit()
        }
        val Truebuttn4 : Button = view.findViewById(R.id.buttontrue4)
        Truebuttn4.setOnClickListener {
            val toast4t = Toast.makeText(this@fourthfragment.requireActivity(), R.string.Correct, Toast.LENGTH_SHORT).show()
        }

        val Falsebuttn4 : Button = view.findViewById(R.id.buttonfalse4)
        Falsebuttn4.setOnClickListener {
            val toast4f = Toast.makeText(this@fourthfragment.requireActivity(), R.string.Wrong, Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this@fourthfragment.requireActivity(), getString(R.string.question3), Toast.LENGTH_SHORT).show() //

        return view
    }

}