package com.breezefieldjjscouts.features.weather.api

import com.breezefieldjjscouts.features.task.api.TaskApi
import com.breezefieldjjscouts.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}