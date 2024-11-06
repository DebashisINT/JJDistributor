package com.breezefieldjjscouts.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldjjscouts.app.FileUtils
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.NewQuotation.model.*
import com.breezefieldjjscouts.features.addshop.model.AddShopRequestData
import com.breezefieldjjscouts.features.addshop.model.AddShopResponse
import com.breezefieldjjscouts.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldjjscouts.features.damageProduct.model.delBreakageReq
import com.breezefieldjjscouts.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldjjscouts.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldjjscouts.features.myjobs.model.WIPImageSubmit
import com.breezefieldjjscouts.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}