package com.example.commonlibrary.mvvm.vm

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel : ViewModel(),BaseViewModelApi {

    protected var mCompositeDisposable = CompositeDisposable()


    override fun onDestroy() {
        mCompositeDisposable.clear()
    }


}