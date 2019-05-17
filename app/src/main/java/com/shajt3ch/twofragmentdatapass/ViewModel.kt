package com.shajt3ch.twofragmentdatapass

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ViewModel : ViewModel() {
    val inputNumber = MutableLiveData<Int>()
}