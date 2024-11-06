package com.breezefieldjjscouts.features.myjobs.api

import android.content.Context
import android.net.Uri
import android.util.Log
import com.breezefieldjjscouts.app.FileUtils
import com.breezefieldjjscouts.base.BaseResponse
import com.breezefieldjjscouts.features.activities.model.ActivityImage
import com.breezefieldjjscouts.features.activities.model.AddActivityInputModel
import com.breezefieldjjscouts.features.myjobs.model.WIPSubmit
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

object MyJobRepoProvider {
    fun jobRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.create())
    }

    fun jobMultipartRepoProvider(): MyJobRepo {
        return MyJobRepo(MyJobApi.createMultiPart())
    }

}