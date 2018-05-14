package com.joyfulmath.artofdev.leetcode

import com.joyfulmath.artofdev.utils.TraceLog
import javax.inject.Inject

class Sn9 : BasicSnInterface {

    @Inject
    constructor()

    companion object {
        @JvmStatic
        fun isPalindrome2(x: Int): Boolean {
            return when {
                x < 0 -> false
                x in 0..9 -> true
                else -> checkPalindrome(x)

            }
        }

        @JvmStatic
        private fun checkPalindrome(x: Int): Boolean {
            TraceLog.i("x:$x")
            //x>=10
            var strX = x.toString()
            var length = strX.length / 2 + strX.length % 2
            var lastIndex = strX.length - 1

            for (i in 0 until length) {
                if (strX[i] != strX[lastIndex - i]) {
                    TraceLog.i("strX[$i]:${strX[i]},strX[${lastIndex - i}]:${strX[lastIndex - i]}")
                    return false
                }
            }

            return true

        }


    }

    override fun sample() {
        TraceLog.i()
        var result = isPalindrome(123525321)
        TraceLog.i("sample is $result")
    }


    fun isPalindrome(x: Int): Boolean {
        TraceLog.i("x:$x")
        return when {
            x < 0 -> false
            x in 0..9 -> true
            else -> {
                var p = x
                var q = 0

                while (p >= 10) {
                    q *= 10
                    q += p % 10
                    p /= 10
                }

                return q == x / 10 && p == x % 10

            }

        }
    }


}