package com.base

import androidx.lifecycle.ViewModel
import com.utils.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.ref.WeakReference

abstract class ViewModelB<N>(private var schedulerProvider: SchedulerProvider) : ViewModel() {

    private lateinit var navigator: WeakReference<N>
    var compositeDisposable: CompositeDisposable = CompositeDisposable()

    fun setNavigator(navigator: N) {
        this.navigator = WeakReference(navigator)
    }

    fun getNavigator(): N = navigator.get()!!

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    fun launch(job: () -> Disposable) {
        compositeDisposable.add(job())
    }

    fun dispose() {
        compositeDisposable.dispose()
    }

    fun clear() {
        compositeDisposable.clear()
    }
}