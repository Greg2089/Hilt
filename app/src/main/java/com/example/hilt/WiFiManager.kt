package com.example.hilt

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton


class WiFiManager (private val settings: WiFiSettings) {
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