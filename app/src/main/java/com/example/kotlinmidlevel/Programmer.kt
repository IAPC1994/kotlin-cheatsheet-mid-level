package com.example.kotlinmidlevel

class Programmer(name:String, age:Int, val language:String): Person(name, age), Vehicle {
    override fun work() {
        println("This person is programming")
    }

    fun sayLanguage(){
        println("This programmer use $language")
    }

    override fun goToWork() {
        println("This person is going to Google")
    }

    override fun drive() {
        println("This person is driving to home")
    }
}