package com.breezefieldjjscouts.features.lead.api

import com.breezefieldjjscouts.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldjjscouts.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}