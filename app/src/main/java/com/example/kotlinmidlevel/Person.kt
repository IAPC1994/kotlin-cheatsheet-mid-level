package com.example.kotlinmidlevel

open class Person(name:String, age:Int):Work() {
    open fun work(){
        println("This person is working")
    }

    override fun goToWork() {
        println("This person is going to work")
    }
}