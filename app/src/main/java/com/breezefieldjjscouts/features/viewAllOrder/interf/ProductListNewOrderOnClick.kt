package com.breezefieldjjscouts.features.viewAllOrder.interf

import com.breezefieldjjscouts.app.domain.NewOrderGenderEntity
import com.breezefieldjjscouts.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}