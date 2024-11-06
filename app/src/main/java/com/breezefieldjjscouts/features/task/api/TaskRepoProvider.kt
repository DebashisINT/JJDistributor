package com.breezefieldjjscouts.features.task.api

import com.breezefieldjjscouts.features.timesheet.api.TimeSheetApi
import com.breezefieldjjscouts.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}