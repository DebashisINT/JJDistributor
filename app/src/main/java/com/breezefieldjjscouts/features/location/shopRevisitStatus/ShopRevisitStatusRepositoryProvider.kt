package com.breezefieldjjscouts.features.location.shopRevisitStatus

import com.breezefieldjjscouts.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldjjscouts.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}