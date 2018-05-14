package com.joyfulmath.artofdev

import dagger.Component

@Component
interface MainActivityCompont {
    fun inject(mainActivity: MainActivity)
}