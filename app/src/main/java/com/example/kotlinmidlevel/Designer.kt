package com.example.kotlinmidlevel

class Designer(name:String, age:Int): Person(name, age) {
    override fun work() {
        println("This person is designing")
    }
}