package com.breezefieldjjscouts.features.location.api

import com.breezefieldjjscouts.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldjjscouts.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}