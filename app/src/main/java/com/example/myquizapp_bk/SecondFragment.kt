package com.example.myquizapp_bk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class SecondFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val prevBtn : Button = view.findViewById(R.id.prev)
        prevBtn.setOnClickListener {
            val fragment = thirdfragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, fragment)?.commit()
        }

       val Truebuttn2 : Button = view.findViewById(R.id.buttontrue2)
       Truebuttn2.setOnClickListener {
           val toast2t = Toast.makeText(this@SecondFragment.requireActivity(), getString(R.string.Correct), Toast.LENGTH_SHORT).show()
       }

        val Falsebuttn2 : Button = view.findViewById(R.id.buttonfalse2)
        Falsebuttn2.setOnClickListener {
            val toast2f = Toast.makeText(this@SecondFragment.requireActivity(), getString(R.string.Wrong), Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this@SecondFragment.requireActivity(), getString(R.string.Next), Toast.LENGTH_SHORT).show() //

        return view
    }



}