package com.breezefieldjjscouts.features.newcollection.model

import com.breezefieldjjscouts.app.domain.CollectionDetailsEntity
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}