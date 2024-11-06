package com.breezefieldjjscouts.features.newcollectionreport

import com.breezefieldjjscouts.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}