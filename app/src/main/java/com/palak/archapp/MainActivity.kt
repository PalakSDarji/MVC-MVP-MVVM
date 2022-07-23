package com.palak.archapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.palak.archapp.databinding.ActivityMainBinding
import com.palak.mvc.MVCActivity
import com.palak.mvp.MVPActivity
import com.palak.mvvm.MVVMActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mvc.setOnClickListener {
            startActivity(Intent(this@MainActivity, MVCActivity::class.java))
        }

        binding.mvp.setOnClickListener {
            startActivity(Intent(this@MainActivity, MVPActivity::class.java))
        }

        binding.mvvm.setOnClickListener {
            startActivity(Intent(this@MainActivity, MVVMActivity::class.java))
        }
    }
}