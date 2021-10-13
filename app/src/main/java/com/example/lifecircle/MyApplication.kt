package com.example.lifecircle

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

/**

 * @Author : chenguang

 * @Time : On 2021/10/13 0013 10:33

 * @Description : MyApplication

 */
class MyApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyApplicationLifeCircleObserver())
    }

}