package com.palak.mvvm

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel(app: Application) : AndroidViewModel(app) {

    private val mutableStateFlow : MutableStateFlow<String> = MutableStateFlow("Default")
    val stateFlow : StateFlow<String> = mutableStateFlow

    fun updateText(){
        mutableStateFlow.value = "This is from mvvm viewmodel"
    }
}