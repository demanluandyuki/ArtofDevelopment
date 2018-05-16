package com.joyfulmath.artofdev.base

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.joyfulmath.artofdev.utils.TraceLog

abstract class BasicService:Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        TraceLog.i(this.javaClass.simpleName)
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onCreate() {
        TraceLog.i(this.javaClass.simpleName)
        super.onCreate()
    }

    override fun onBind(intent: Intent?): IBinder? {
        TraceLog.i(this.javaClass.simpleName)
        return null
    }

    override fun onUnbind(intent: Intent?): Boolean {
        TraceLog.i(this.javaClass.simpleName)
        return super.onUnbind(intent)
    }

    override fun onDestroy() {
        TraceLog.i(this.javaClass.simpleName)
        super.onDestroy()
    }
}