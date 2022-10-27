package com.valentinerutto.weatherapp.data.network.api

import com.valentinerutto.weatherapp.data.network.model.CurrentWeather
import com.valentinerutto.weatherapp.data.network.model.OneCallForeCastResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    @GET("weather")
    suspend fun getCurrentWeather(@Query("lat") lat: String,
                                  @Query("lon") lon: String,
                                  @Query("appid") apiKey: String,
                                  @Query("units") units: String = "metric"): Response<CurrentWeather>

    @GET("onecall")
    suspend fun getOneCallForecast(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("appid") apiKey: String,
        @Query("units") units: String = "metric",
        @Query("exclude") exclude: String = "current,minutely,hourly,alerts"
    ):Response<OneCallForeCastResponse>

}