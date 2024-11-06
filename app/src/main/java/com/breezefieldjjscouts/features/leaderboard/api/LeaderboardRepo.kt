package com.breezefieldjjscouts.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldjjscouts.app.FileUtils
import com.breezefieldjjscouts.app.Pref
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.addshop.model.AddLogReqData
import com.breezefieldjjscouts.features.addshop.model.AddShopRequestData
import com.breezefieldjjscouts.features.addshop.model.AddShopResponse
import com.breezefieldjjscouts.features.addshop.model.LogFileResponse
import com.breezefieldjjscouts.features.addshop.model.UpdateAddrReq
import com.breezefieldjjscouts.features.contacts.CallHisDtls
import com.breezefieldjjscouts.features.contacts.CompanyReqData
import com.breezefieldjjscouts.features.contacts.ContactMasterRes
import com.breezefieldjjscouts.features.contacts.SourceMasterRes
import com.breezefieldjjscouts.features.contacts.StageMasterRes
import com.breezefieldjjscouts.features.contacts.StatusMasterRes
import com.breezefieldjjscouts.features.contacts.TypeMasterRes
import com.breezefieldjjscouts.features.dashboard.presentation.DashboardActivity
import com.breezefieldjjscouts.features.login.model.WhatsappApiData
import com.breezefieldjjscouts.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}