package com.joyfulmath.artofdev.ipc

import android.content.Intent
import com.joyfulmath.artofdev.base.BasicService

//need ndk
class PipeLineDemoService: BasicService() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        startService(Intent(this,DemoCService::class.java))
        return super.onStartCommand(intent, flags, startId)
    }
}