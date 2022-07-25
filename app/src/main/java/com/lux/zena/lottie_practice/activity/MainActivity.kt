package com.lux.zena.lottie_practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lux.zena.lottie_practice.R
import com.lux.zena.lottie_practice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }
}