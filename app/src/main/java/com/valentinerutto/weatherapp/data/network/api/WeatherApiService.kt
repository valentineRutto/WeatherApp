package com.valentinerutto.weatherapp.data.network.api

import com.valentinerutto.weatherapp.BuildConfig
import com.valentinerutto.weatherapp.data.network.model.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET

interface WeatherApiService {
    @GET("2.5/weather?lat=35&lon=139&appid=${BuildConfig.OPEN_WEATHER_API_KEY}")
    suspend fun getCurrentWeather(): Response<CurrentWeather>
}