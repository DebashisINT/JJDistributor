package com.breezefieldjjscouts.features.mylearning.apiCall

import com.breezefieldjjscouts.features.login.api.opportunity.OpportunityListApi
import com.breezefieldjjscouts.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}