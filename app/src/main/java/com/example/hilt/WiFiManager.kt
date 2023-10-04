package com.example.hilt

import android.util.Log
import javax.inject.Inject

class WiFiManager @Inject constructor(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()

    }
}

class WiFiSettings @Inject constructor() {
    fun openConnection() {
        Log.d("MyLog", "CONNECTED")
    }

    fun writeBytes() {
        Log.d("MyLog", "HELLO")
    }

}