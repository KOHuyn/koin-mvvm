package com.kohuyn.koin_mvvm.ui

import com.google.gson.Gson
import com.kohuyn.koin_mvvm.base.BaseViewModel
import com.kohuyn.koin_mvvm.data.DataManager
import com.kohuyn.koin_mvvm.ui.MainNavigator
import com.utils.SchedulerProvider

class MainViewModel(dataManager: DataManager, schedulerProvider: SchedulerProvider, private val gson: Gson) :
        BaseViewModel<MainNavigator>(dataManager, schedulerProvider) {

    fun saveUser(user: String) = dataManager.saveUser("Ahihi")

    fun getUser() = dataManager.getUser()
}