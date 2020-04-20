package com.kohuyn.koin_mvvm.data.local.prefs

/**
 * Created by Kaz on 10:38 2018-12-19
 */
interface PrefsHelper {

    fun getUser(): String?

    fun saveUser(user: String)
}