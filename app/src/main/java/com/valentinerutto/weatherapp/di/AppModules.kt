package com.valentinerutto.weatherapp.di

import com.valentinerutto.weatherapp.App
import com.valentinerutto.weatherapp.data.network.api.RetrofitClient.createOkClient
import com.valentinerutto.weatherapp.data.network.api.RetrofitClient.createRetrofit
import com.valentinerutto.weatherapp.data.network.api.WeatherApiService
import com.valentinerutto.weatherapp.ui.SharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

val appModules = module {
    single { App.INSTANCE }
    single<WeatherApiService> { (get() as Retrofit).create(WeatherApiService::class.java) }
    single { createOkClient() }

    single {
        createRetrofit(
            baseUrl = "https://api.openweathermap.org/data/",
            get()
        )
    }
    viewModel { SharedViewModel(apiService = get()) }


}

fun getDynamicURl(baseUrl:String){

}
