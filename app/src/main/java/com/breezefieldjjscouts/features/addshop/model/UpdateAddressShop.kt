package com.breezefieldjjscouts.features.addshop.model

import com.breezefieldjjscouts.app.domain.AddShopDBModelEntity
import com.breezefieldjjscouts.app.domain.CallHisEntity
import com.breezefieldjjscouts.base.BaseResponse

data class UpdateAddrReq  (var user_id:String="",var shop_list:ArrayList<UpdateAddressShop> = ArrayList())

data class UpdateAddressShop(var shop_id:String="",var shop_updated_lat:String="",var shop_updated_long:String="",var shop_updated_address:String="")