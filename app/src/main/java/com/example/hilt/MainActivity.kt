package com.example.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var wifiManager: WiFiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val settings = WiFiSettings()
        wifiManager = WiFiManager(settings)

        wifiManager.connect()
        wifiManager.sendMessage()
    }
}