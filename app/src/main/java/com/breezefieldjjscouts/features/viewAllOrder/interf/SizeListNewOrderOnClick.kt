package com.breezefieldjjscouts.features.viewAllOrder.interf

import com.breezefieldjjscouts.app.domain.NewOrderProductEntity
import com.breezefieldjjscouts.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}