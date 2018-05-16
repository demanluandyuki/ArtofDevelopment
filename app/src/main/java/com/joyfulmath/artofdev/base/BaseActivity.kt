package com.joyfulmath.artofdev.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.joyfulmath.artofdev.utils.TraceLog

open class BaseActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        TraceLog.i(this.javaClass.simpleName)
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        TraceLog.i(this.javaClass.simpleName)
        super.onStart()
    }

    override fun onResume() {
        TraceLog.i(this.javaClass.simpleName)
        super.onResume()
    }

    override fun onPause() {
        TraceLog.i(this.javaClass.simpleName)
        super.onPause()
    }

    override fun onStop() {
        TraceLog.i(this.javaClass.simpleName)
        super.onStop()
    }

    override fun onDestroy() {
        TraceLog.i(this.javaClass.simpleName)
        super.onDestroy()
    }
}