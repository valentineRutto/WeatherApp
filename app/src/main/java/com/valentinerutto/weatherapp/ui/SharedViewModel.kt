package com.valentinerutto.weatherapp.ui

import androidx.lifecycle.ViewModel
import com.valentinerutto.weatherapp.BuildConfig
import com.valentinerutto.weatherapp.data.network.api.WeatherApiService

class SharedViewModel (private val apiService: WeatherApiService) : ViewModel() {
    suspend fun getCurrentWeather(latitude: String,
                                      longitude: String,
                                      apiKey: String) = apiService.getCurrentWeather(
        latitude,longitude,apiKey=BuildConfig.OPEN_WEATHER_API_KEY)
}
