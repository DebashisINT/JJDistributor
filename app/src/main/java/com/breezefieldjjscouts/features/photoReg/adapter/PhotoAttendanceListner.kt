package com.breezefieldjjscouts.features.photoReg.adapter

import com.breezefieldjjscouts.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}