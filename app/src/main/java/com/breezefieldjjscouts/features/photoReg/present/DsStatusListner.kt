package com.breezefieldjjscouts.features.photoReg.present

import com.breezefieldjjscouts.app.domain.ProspectEntity
import com.breezefieldjjscouts.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}