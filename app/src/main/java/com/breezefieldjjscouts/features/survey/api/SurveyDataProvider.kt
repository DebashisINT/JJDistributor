package com.breezefieldjjscouts.features.survey.api

import com.breezefieldjjscouts.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldjjscouts.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}