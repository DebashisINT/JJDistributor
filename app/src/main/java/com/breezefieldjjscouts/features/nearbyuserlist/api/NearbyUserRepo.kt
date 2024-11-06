package com.breezefieldjjscouts.features.nearbyuserlist.api

import com.breezefieldjjscouts.app.Pref
import com.breezefieldjjscouts.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldjjscouts.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldjjscouts.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}