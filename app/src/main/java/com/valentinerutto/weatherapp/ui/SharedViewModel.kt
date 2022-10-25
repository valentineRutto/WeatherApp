package com.valentinerutto.weatherapp.ui

import androidx.lifecycle.ViewModel
import com.valentinerutto.weatherapp.data.network.api.WeatherApiService

class SharedViewModel (private val apiService: WeatherApiService) : ViewModel() {
    suspend fun getCurrent() = apiService.getCurrentWeather()
}
