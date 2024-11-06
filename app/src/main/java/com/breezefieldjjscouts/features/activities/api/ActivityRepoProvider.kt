package com.breezefieldjjscouts.features.activities.api

import com.breezefieldjjscouts.features.member.api.TeamApi
import com.breezefieldjjscouts.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}