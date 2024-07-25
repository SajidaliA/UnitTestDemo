package com.example.unittestdemo.util

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPalindrome("Hello")
        //Assert
        assertEquals(false, result)
    }
}