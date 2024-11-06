package com.breezefieldjjscouts.features.viewAllOrder.interf

import com.breezefieldjjscouts.app.domain.NewOrderColorEntity
import com.breezefieldjjscouts.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}