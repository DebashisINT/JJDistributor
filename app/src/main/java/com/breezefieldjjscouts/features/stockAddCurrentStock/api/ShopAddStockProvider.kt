package com.breezefieldjjscouts.features.stockAddCurrentStock.api

import com.breezefieldjjscouts.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldjjscouts.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}