package com.joyfulmath.artofdev.launchmode

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.joyfulmath.artofdev.base.BaseActivity
import com.joyfulmath.artofdev.R
import com.joyfulmath.artofdev.utils.TraceLog
import kotlinx.android.synthetic.main.activity_launch_demo.*

class LaunchModeDemoActivity: BaseActivity() {

    companion object {
        @JvmStatic
        fun openLaunchActivity(activity: Context){
            TraceLog.i()
            var intent = Intent(activity,LaunchModeDemoActivity::class.java)
//            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TraceLog.i()
        setContentView(R.layout.activity_launch_demo)
        launch_mode_tv.text = "single standard"
    }

    override fun onStart() {
        super.onStart()
    }

}