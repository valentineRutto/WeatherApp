package com.valentinerutto.weatherapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.valentinerutto.weatherapp.data.local.dao.CurrentWeatherDao
import com.valentinerutto.weatherapp.data.local.dao.FavouritesDao
import com.valentinerutto.weatherapp.data.local.dao.ForecastDao
import com.valentinerutto.weatherapp.data.local.entities.CurrentWeather

@Database(
    entities = [
        CurrentWeather::class
    ], version = 1, exportSchema = false
)

abstract class WeatherDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao
    abstract fun weatherForecastDao(): ForecastDao
    abstract fun favouritesDao(): FavouritesDao
}