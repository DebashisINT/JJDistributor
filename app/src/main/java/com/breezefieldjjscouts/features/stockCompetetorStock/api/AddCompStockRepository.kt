package com.breezefieldjjscouts.features.stockCompetetorStock.api

import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.orderList.model.NewOrderListResponseModel
import com.breezefieldjjscouts.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldjjscouts.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}