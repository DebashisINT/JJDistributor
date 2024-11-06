package com.breezefieldjjscouts.features.photoReg.adapter

import com.breezefieldjjscouts.features.photoReg.model.ProsCustom
import com.breezefieldjjscouts.features.photoReg.model.UserListResponseModel

interface ProsListSelectionListner {
    fun getInfo(obj: ProsCustom)
}