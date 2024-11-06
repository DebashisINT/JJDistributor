package com.breezefieldjjscouts.features.location.shopRevisitStatus

import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.location.model.ShopDurationRequest
import com.breezefieldjjscouts.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}