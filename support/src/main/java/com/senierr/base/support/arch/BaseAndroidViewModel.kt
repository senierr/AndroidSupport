package com.senierr.base.support.arch

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

/**
 * AndroidViewModel基类
 *
 * @author senierr_zhou
 * @date 2023/08/08
 */
open class BaseAndroidViewModel(application: Application) : AndroidViewModel(application) {

    protected val TAG: String = this.javaClass.simpleName

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "onCleared")
    }
}