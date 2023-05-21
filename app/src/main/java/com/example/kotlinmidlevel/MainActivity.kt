package com.example.kotlinmidlevel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //enumClasses()
    }

    enum class Direction(val dir: Int) {
        NORTH(1),
        SOUTH(-1),
        EAST(1),
        WEST(-1);

        fun description(): String{
            return when (this){
                NORTH -> "The direction is NORTH"
                SOUTH -> "The direction is SOUTH"
                EAST -> "The direction is EAST"
                WEST -> "The direction is WEST"
            }
        }
    }

    private fun enumClasses(){
        var userDirection:Direction? = null
        println("Direccion: $userDirection")

        userDirection = Direction.NORTH
        println("Direccion: $userDirection")

        userDirection = Direction.WEST
        println("Direccion: $userDirection")

        println("Name property: ${userDirection.name}")
        println("Ordinal property: ${userDirection.ordinal}")

        // ENUM FUNCTIONS
        println(userDirection.description())

        // ENUM PARAMETER
        println(userDirection.dir)
    }
}