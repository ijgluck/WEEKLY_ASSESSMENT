package com.ijeoma.weekfive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ijeoma.weekfive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
