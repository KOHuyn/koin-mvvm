package com.kohuyn.koin_mvvm

import android.app.Application
import com.kohuyn.koin_mvvm.di.mvvmModule
import com.utils.Logger
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.EmptyLogger

class MvvmKoinApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Logger.init(true)
        startKoin {
            androidContext(this@MvvmKoinApplication)
            modules(mvvmModule)
            logger(EmptyLogger())
        }
    }
}