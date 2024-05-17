package com.senierr.test

import android.view.LayoutInflater
import com.senierr.base.support.ui.BaseActivity
import com.senierr.test.databinding.ActivityMainBinding

/**
 * 首页
 *
 * @author senierr_zhou
 * @date 2023/07/28
 */
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun createViewBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}