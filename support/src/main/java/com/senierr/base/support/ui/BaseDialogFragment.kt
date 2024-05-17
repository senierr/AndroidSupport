package com.senierr.base.support.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.viewbinding.ViewBinding

/**
 * FragmentDialog基类
 *
 * @author senierr_zhou
 * @date 2023/07/28
 */
abstract class BaseDialogFragment<VB: ViewBinding> : DialogFragment() {

    protected val TAG: String = this.javaClass.simpleName

    protected var binding: VB? = null

    /**
     * 创建视图绑定
     */
    abstract fun createViewBinding(inflater: LayoutInflater, container: ViewGroup?): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = createViewBinding(inflater, container)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
        Log.i(TAG, "onDestroyView")
    }
}