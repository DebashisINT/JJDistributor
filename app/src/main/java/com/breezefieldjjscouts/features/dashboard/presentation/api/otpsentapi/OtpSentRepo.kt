package com.breezefieldjjscouts.features.dashboard.presentation.api.otpsentapi

import com.breezefieldjjscouts.app.Pref
import com.breezefieldjjscouts.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 22-11-2018.
 */
class OtpSentRepo(val apiService: OtpSentAPi) {
    fun otpSent(shopId: String): Observable<BaseResponse> {
        return apiService.otpSent(Pref.session_token!!, Pref.user_id!!, shopId)
    }
}