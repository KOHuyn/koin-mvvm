package com.kohuyn.koin_mvvm.data

import com.kohuyn.koin_mvvm.data.local.prefs.PrefsHelper

/**
 * Created by Kaz on 10:14 2018-12-19
 */
class AppDataManager constructor(private val prefsHelper: PrefsHelper) : DataManager {

    override fun getUser(): String? = prefsHelper.getUser()

    override fun saveUser(user: String) = prefsHelper.saveUser(user)
}