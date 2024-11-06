package com.breezefieldjjscouts.features.viewAllOrder.interf

import com.breezefieldjjscouts.app.domain.NewOrderGenderEntity
import com.breezefieldjjscouts.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}