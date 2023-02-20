package com.example.myquizapp_bk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class thirdfragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_thirdfragment, container, false)
        val prevBtn : Button = view.findViewById(R.id.third)
        prevBtn.setOnClickListener {
            val fragment = fourthfragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, fragment)?.commit()
        }
        val Truebuttn3 : Button = view.findViewById(R.id.buttontrue3)
        Truebuttn3.setOnClickListener {
            val toast3t = Toast.makeText(this@thirdfragment.requireActivity(), R.string.Wrong, Toast.LENGTH_SHORT).show()
        }

        val Falsebuttn3 : Button = view.findViewById(R.id.buttonfalse3)
        Falsebuttn3.setOnClickListener {
            val toast3f = Toast.makeText(this@thirdfragment.requireActivity(), R.string.Correct, Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this@thirdfragment.requireActivity(), getString(R.string.Question2), Toast.LENGTH_SHORT).show() //

        return view
    }

}