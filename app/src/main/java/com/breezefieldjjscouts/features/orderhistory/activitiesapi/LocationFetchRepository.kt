package com.breezefieldjjscouts.features.orderhistory.activitiesapi

import com.breezefieldjjscouts.app.Pref
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.orderhistory.model.FetchLocationRequest
import com.breezefieldjjscouts.features.orderhistory.model.FetchLocationResponse
import com.breezefieldjjscouts.features.orderhistory.model.SubmitLocationInputModel
import com.breezefieldjjscouts.features.orderhistory.model.UnknownReponseModel
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class LocationFetchRepository(val apiService: LocationFetchApi){
    fun fetchLocationUpdate(location: FetchLocationRequest): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(location)
    }

    fun fetchLocationUpdate(date: String): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun fetchUnknownLocation(): Observable<UnknownReponseModel> {
        return apiService.getUnknownLocation(Pref.session_token!!, Pref.user_id!!)
    }

    fun submitLoc(loc: SubmitLocationInputModel): Observable<BaseResponse> {
        return apiService.submitLocation(loc)
    }
}