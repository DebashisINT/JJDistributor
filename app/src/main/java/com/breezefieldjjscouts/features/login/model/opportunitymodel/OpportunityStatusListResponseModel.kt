package com.breezefieldjjscouts.features.login.model.opportunitymodel

import com.breezefieldjjscouts.app.domain.OpportunityStatusEntity
import com.breezefieldjjscouts.app.domain.ProductListEntity
import com.breezefieldjjscouts.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}