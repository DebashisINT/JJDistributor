package com.breezefieldjjscouts.features.viewAllOrder.interf

import com.breezefieldjjscouts.app.domain.NewOrderGenderEntity
import com.breezefieldjjscouts.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}