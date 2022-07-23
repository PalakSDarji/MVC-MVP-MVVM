package com.palak.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import com.palak.mvvm.databinding.ActivityMvvmBinding

class MVVMActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMvvmBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMvvmBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.lifecycleOwner = this //to update stateflow data directly in xml
        binding.viewModel = viewModel
    }
}