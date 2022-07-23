package com.palak.mvc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.palak.mvc.databinding.ActivityMvcBinding

class MVCActivity : AppCompatActivity() {

    private val txt : String = "This is also controller."
    private lateinit var binding : ActivityMvcBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMvcBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonMvc.setOnClickListener {
            binding.txtMvc.text = txt
        }
    }
}