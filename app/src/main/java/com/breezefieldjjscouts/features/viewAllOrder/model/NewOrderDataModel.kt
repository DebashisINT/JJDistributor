package com.breezefieldjjscouts.features.viewAllOrder.model

import com.breezefieldjjscouts.app.domain.NewOrderColorEntity
import com.breezefieldjjscouts.app.domain.NewOrderGenderEntity
import com.breezefieldjjscouts.app.domain.NewOrderProductEntity
import com.breezefieldjjscouts.app.domain.NewOrderSizeEntity
import com.breezefieldjjscouts.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

