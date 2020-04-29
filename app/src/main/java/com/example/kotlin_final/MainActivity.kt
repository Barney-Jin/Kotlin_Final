package com.example.kotlin_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun main(args: Array<String>) {
        val first = args[0].toDouble()
        val second = args[2].toDouble()
        val operator = args[1].toCharArray()[0]
        val result: Double
        when (operator) {
            '+' -> result = first + second
            '-' -> result = first - second
            '*' -> result = first * second
            '/' -> result = first / second
            else -> {
                System.out.printf("cannot solve")
                return
            }
        }
        print(result.toString())
    }
}