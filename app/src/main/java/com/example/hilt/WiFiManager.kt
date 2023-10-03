package com.example.hilt

import android.util.Log

class WiFiManager(private val settings: WiFiSettings) {
    fun connect() {
        settings.openConnection()
    }

    fun sendMessage() {
        settings.writeBytes()

    }
}

class WiFiSettings {
    fun openConnection() {
        Log.d("MyLog", "CONNECTED")
    }

    fun writeBytes() {
        Log.d("MyLog", "HELLO")
    }

}