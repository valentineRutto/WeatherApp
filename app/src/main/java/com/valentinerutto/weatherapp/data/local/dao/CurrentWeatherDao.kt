package com.valentinerutto.weatherapp.data.local.dao

import androidx.room.Dao
import com.valentinerutto.weatherapp.data.local.entities.CurrentWeather

@Dao
interface CurrentWeatherDao : BaseDao<CurrentWeather>