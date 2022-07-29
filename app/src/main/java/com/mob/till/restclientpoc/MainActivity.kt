package com.mob.till.restclientpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mob.till.librarypoc.Callback
import com.mob.till.librarypoc.NetworkLibrary
import com.mob.till.restclientpoc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), Callback {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val networkLib = NetworkLibrary()
            networkLib.makeRequest(this, this)
        }
    }

    override fun onResponse(response: String) {
        runOnUiThread {
            binding.textApi.text = response
        }
    }
}