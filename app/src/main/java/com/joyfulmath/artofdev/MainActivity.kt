package com.joyfulmath.artofdev

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.joyfulmath.artofdev.ipc.PipeLineDemoService
import com.joyfulmath.artofdev.launchmode.LaunchModeDemoActivity
import com.joyfulmath.artofdev.leetcode.Sn9
import com.joyfulmath.artofdev.utils.TraceLog
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sn9: Sn9


    init {
        DaggerMainActivityCompont.create().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TraceLog.i()
        setContentView(R.layout.activity_main)
        savedInstanceState?.let {
            TraceLog.i(it.toString())
        }

        launch_btn.setOnClickListener({
            startService(Intent(this,PipeLineDemoService::class.java))
        })
    }

    override fun onStart() {
        super.onStart()
        sn9.sample()
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
