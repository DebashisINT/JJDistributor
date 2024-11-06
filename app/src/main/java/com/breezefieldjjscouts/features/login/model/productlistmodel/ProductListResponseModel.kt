package com.breezefieldjjscouts.features.login.model.productlistmodel

import com.breezefieldjjscouts.app.domain.ProductListEntity
import com.breezefieldjjscouts.base.BaseResponse

/**
 * Created by Saikat on 20-11-2018.
 */
class ProductListResponseModel : BaseResponse() {
    //var product_list: ArrayList<ProductListDataModel>? = null
    var product_list: ArrayList<ProductListEntity>? = null
}