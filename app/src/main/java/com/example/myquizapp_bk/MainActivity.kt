package com.example.myquizapp_bk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //make launcher screen as first fragment

        supportFragmentManager.beginTransaction().replace(R.id.nav_container, FirstFragment()).commit()

    }
}