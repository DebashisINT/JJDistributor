package com.breezefieldjjscouts.features.orderList.model

import com.breezefieldjjscouts.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}