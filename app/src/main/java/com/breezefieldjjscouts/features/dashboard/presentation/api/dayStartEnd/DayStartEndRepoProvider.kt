package com.breezefieldjjscouts.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldjjscouts.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldjjscouts.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}