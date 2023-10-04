package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

/**
 * Модуль, для использования Hilt, если нужно управлять зависимостями в классах разных библиотек(написанных не мной)*/
@Module
@InstallIn(ActivityRetainedComponent::class)
object MainModul {
    @Provides
    @ActivityRetainedScoped
    fun provideWiFiManager(settings: WiFiSettings):WiFiManager{
        return WiFiManager(settings)
    }
    fun provideWiFiSettings():WiFiSettings{
        return WiFiSettings()
    }

}