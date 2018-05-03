package com.joyfulmath.artofdev

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.joyfulmath.artofdev.utils.TraceLog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TraceLog.i()
        setContentView(R.layout.activity_main)
        savedInstanceState?.let {
            TraceLog.i(it.toString())
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle?) {
        super.onSaveInstanceState(savedInstanceState)
        TraceLog.i()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        TraceLog.i()
    }
}
