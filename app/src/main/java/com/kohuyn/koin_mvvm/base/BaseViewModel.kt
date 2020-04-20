package com.kohuyn.koin_mvvm.base

import com.base.ViewModelB
import com.kohuyn.koin_mvvm.data.DataManager
import com.utils.SchedulerProvider

open class BaseViewModel<N>(var dataManager: DataManager, var schedulerProvider: SchedulerProvider) :
        ViewModelB<N>(schedulerProvider)