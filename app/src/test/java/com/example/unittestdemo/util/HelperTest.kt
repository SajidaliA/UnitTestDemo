package com.example.unittestdemo.util

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPallindrome() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPallindrome("Hello")
        //Assert
        assertEquals(false, result)
    }
}