package com.breezefieldjjscouts.features.weather.api

import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.task.api.TaskApi
import com.breezefieldjjscouts.features.task.model.AddTaskInputModel
import com.breezefieldjjscouts.features.weather.model.ForeCastAPIResponse
import com.breezefieldjjscouts.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}