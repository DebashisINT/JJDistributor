package com.breezefieldjjscouts.features.login.model

import com.breezefieldjjscouts.app.domain.QuestionSubmitEntity


class GetQtsAnsSubmitDtlsResponseModel {
    var status:String? = null
    var message:String? = null
    var Question_list: ArrayList<QuestionSubmitEntity>? = null
}