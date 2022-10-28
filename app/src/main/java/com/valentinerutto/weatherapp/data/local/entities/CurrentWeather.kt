package com.valentinerutto.weatherapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CurrentWeather(
    @PrimaryKey
    val id: Int
    )
