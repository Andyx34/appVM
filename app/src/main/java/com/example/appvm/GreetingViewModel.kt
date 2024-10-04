package com.example.appvm


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GreetingViewModel : ViewModel(){
    private val _randomvm:MutableLiveData<Int> = MutableLiveData<Int>(0)
    val randomvm:LiveData<Int> = _randomvm

    init {
        _randomvm.value = Random.nextInt(0,2023)
    }
}