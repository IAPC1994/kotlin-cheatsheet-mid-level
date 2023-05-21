package com.example.kotlinmidlevel

class MyNestedAndInnerClass {

    private val one = 1

    private fun returnOne(): Int{
        return one
    }

    //Nested Class
    class MyNestedClass{
        fun sum( first: Int, second: Int): Int {
            return first + second
        }
    }

    //Inner class
    inner class MyInnerClass {
        fun sumTwo(number: Int):Int{
            return number + one + returnOne()
        }
    }
}