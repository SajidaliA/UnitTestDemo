package com.example.unittestdemo.util

class Helper {
    fun isPallindrome(input: String): Boolean {
        var i = 0
        var j = input.length -1
        var ressult = true

        while (i<j){
            if (input[i] != input[j]){
                ressult = false
                break
            }
            i++
            j--
        }
        return ressult
    }
}