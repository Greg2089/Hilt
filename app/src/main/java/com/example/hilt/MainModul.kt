package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Модуль, для использования Hilt, если нужно управлять зависимостями в классах разных библиотек(написанных не мной)*/
@Module
@InstallIn(SingletonComponent::class)
object MainModul {
    @Provides
    @Singleton
    fun provideWiFiManager(settings: WiFiSettings):WiFiManager{
        return WiFiManager(settings)
    }
    fun provideWiFiSettings():WiFiSettings{
        return WiFiSettings()
    }

}