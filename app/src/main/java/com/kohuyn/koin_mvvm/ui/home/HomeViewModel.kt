package com.kohuyn.koin_mvvm.ui.home

import com.kohuyn.koin_mvvm.base.BaseViewModel
import com.kohuyn.koin_mvvm.data.DataManager
import com.kohuyn.koin_mvvm.ui.home.HomeNavigator
import com.utils.SchedulerProvider

/**
 * Created by Kaz on 10:53 2018-12-19
 */
class HomeViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider) : BaseViewModel<HomeNavigator>(dataManager, schedulerProvider) {
}