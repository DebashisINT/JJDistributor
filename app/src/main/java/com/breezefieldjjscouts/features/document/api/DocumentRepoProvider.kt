package com.breezefieldjjscouts.features.document.api

import com.breezefieldjjscouts.features.dymanicSection.api.DynamicApi
import com.breezefieldjjscouts.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}