package com.senierr.base.support.arch

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * ViewModel基类
 *
 * @author senierr_zhou
 * @date 2023/08/08
 */
open class BaseViewModel : ViewModel() {

    protected val TAG: String = this.javaClass.simpleName

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "onCleared")
    }
}