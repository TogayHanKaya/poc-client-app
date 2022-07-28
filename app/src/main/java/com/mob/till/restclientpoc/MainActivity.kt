package com.mob.till.restclientpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mob.till.librarypoc.NetworkLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val networkLib = NetworkLibrary()
        networkLib.makeRequest(this)
    }
}