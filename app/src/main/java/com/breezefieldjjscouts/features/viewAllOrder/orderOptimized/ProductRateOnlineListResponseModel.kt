package com.breezefieldjjscouts.features.viewAllOrder.orderOptimized

import com.breezefieldjjscouts.app.domain.ProductOnlineRateTempEntity
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}