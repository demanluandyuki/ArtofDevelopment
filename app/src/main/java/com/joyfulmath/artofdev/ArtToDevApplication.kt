package com.joyfulmath.artofdev

import com.joyfulmath.artofdev.base.BasicApplication
import com.joyfulmath.artofdev.utils.TraceLog

class ArtToDevApplication:BasicApplication() {

    override fun onCreate() {
        super.onCreate()
        TraceLog.i()
    }
}