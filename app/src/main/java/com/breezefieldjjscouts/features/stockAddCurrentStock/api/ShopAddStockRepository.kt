package com.breezefieldjjscouts.features.stockAddCurrentStock.api

import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.location.model.ShopRevisitStatusRequest
import com.breezefieldjjscouts.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldjjscouts.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldjjscouts.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldjjscouts.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}