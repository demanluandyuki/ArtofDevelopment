package com.joyfulmath.artofdev.base

import android.support.multidex.MultiDexApplication
import com.joyfulmath.artofdev.utils.TraceLog

open class BasicApplication: MultiDexApplication(),Thread.UncaughtExceptionHandler {

    override fun onCreate() {
        TraceLog.i(this.javaClass.simpleName)
        TraceLog.i(""+this.hashCode())
        super.onCreate()
    }


    override fun uncaughtException(t: Thread?, e: Throwable?) {
        e?.printStackTrace()
    }
}