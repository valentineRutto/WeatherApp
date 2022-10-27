package com.valentinerutto.weatherapp.ui.repository

import com.valentinerutto.weatherapp.data.local.dao.CurrentWeatherDao
import com.valentinerutto.weatherapp.data.local.dao.FavouritesDao
import com.valentinerutto.weatherapp.data.local.dao.ForecastDao
import com.valentinerutto.weatherapp.data.network.api.WeatherApiService

class WeatherRepository(private val weatherApi: WeatherApiService,
                        private val currentWeatherDao: CurrentWeatherDao?,
                        private val weatherForecastDao: ForecastDao?,
                        private val favouritesDao: FavouritesDao?) {


}