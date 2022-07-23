package com.palak.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.palak.mvp.databinding.ActivityMvpBinding

class MVPActivity : AppCompatActivity() , PresenterView{

    private var presenter : Presenter = Presenter(this)
    private lateinit var binding : ActivityMvpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMvpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.buttonMvp.setOnClickListener {
            presenter.onButtonClicked()
        }
    }

    override fun updateText(string: String) {
        binding.txtMvp.text = string
    }
}