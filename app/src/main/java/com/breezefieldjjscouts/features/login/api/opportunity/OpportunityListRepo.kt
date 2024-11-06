package com.breezefieldjjscouts.features.login.api.opportunity

import com.breezefieldjjscouts.app.Pref
import com.breezefieldjjscouts.app.utils.AppUtils
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.addshop.model.AudioFetchDataCLass
import com.breezefieldjjscouts.features.addshop.model.StockAllResponse
import com.breezefieldjjscouts.features.dashboard.presentation.DashboardActivity
import com.breezefieldjjscouts.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefieldjjscouts.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefieldjjscouts.features.orderITC.SyncDeleteOppt
import com.breezefieldjjscouts.features.orderITC.SyncEditOppt
import com.breezefieldjjscouts.features.orderITC.SyncOppt
import com.breezefieldjjscouts.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }

    fun getAllStock(user_id: String): Observable<StockAllResponse> {
        return apiService.getAllStockApi(user_id)
    }
}