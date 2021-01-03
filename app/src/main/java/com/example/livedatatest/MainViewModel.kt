package com.example.livedatatest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainViewModel {
    val message: LiveData<String> by lazy { MutableLiveData<String>() }
}