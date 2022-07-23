package com.palak.mvp

class Presenter(private val viewPresenter : PresenterView) {

    private val text: String = "This is text from presenter"

    fun onButtonClicked(){
        viewPresenter.updateText(text)
    }
}