package com.breezefieldjjscouts.features.login.model.productlistmodel

import com.breezefieldjjscouts.app.domain.ModelEntity
import com.breezefieldjjscouts.app.domain.ProductListEntity
import com.breezefieldjjscouts.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}