package com.kohuyn.koin_mvvm.di

import com.google.gson.GsonBuilder
import com.kohuyn.koin_mvvm.data.AppDataManager
import com.kohuyn.koin_mvvm.data.DataManager
import com.kohuyn.koin_mvvm.data.local.prefs.AppPrefsHelper
import com.kohuyn.koin_mvvm.data.local.prefs.PrefsHelper
import com.kohuyn.koin_mvvm.ui.MainViewModel
import com.kohuyn.koin_mvvm.ui.home.HomeViewModel
import com.kohuyn.koin_mvvm.ui.other.OtherHihi
import com.utils.SchedulerProvider
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by Kaz on 10:16 2018-12-19
 */
//define app module gson, data manager, etc...
val appModule: Module = module {

    single { SchedulerProvider() }

    single { AppPrefsHelper(get(), "Katana", get()) as PrefsHelper }

    single { AppDataManager(get()) as DataManager }

    single { GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()!! }

    factory { OtherHihi(get(), get()) }
}

//define list view model
val viewModule = module {
    viewModel { MainViewModel(get(), get(), get()) }

    viewModel { HomeViewModel(get(), get()) }
}

val otherModule = module {
    //    provide { OtherHihi() }
}

val mvvmModule = listOf(appModule, viewModule)