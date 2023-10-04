package com.example.hilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * ViewModel как точка доступа.Также Hilt позволяет не создавать фабрику для view model, если есть конструктор*/
@HiltViewModel
class MainViewModel @Inject constructor(var wifiManager: WiFiManager) : ViewModel() {

    init {
        Log.d("MyLog", "MainViewModel instance ID: $wifiManager")
    }

    fun connect() {
        wifiManager.connect()
    }
}