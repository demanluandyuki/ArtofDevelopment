package com.joyfulmath.artofdev.launchmode

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_launch_demo.*

class LaunchModeDemoActivity:AppCompatActivity() {


    companion object {
        @JvmStatic
        fun openLaunchActivity(activity: Context){
            var intent = Intent(activity,LaunchModeDemoActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            activity.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        launch_mode_tv.text = "single standard"
    }
}