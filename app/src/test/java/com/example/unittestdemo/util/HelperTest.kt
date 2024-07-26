package com.example.unittestdemo.util

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    lateinit var helper: Helper
    @Before
    fun setUp(){
        print("Test before every test")
        helper = Helper()
    }

    @After
    fun tearDown(){
        print("After every test case")
    }

    @Test
    fun isPalindrome() {
        //Arrange

        //Act
        val result = helper.isPalindrome("Hello")
        //Assert
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //Arrange
        val helper = Helper()
        //Act
        val result = helper.isPalindrome("level")
        //Assert
        assertEquals(true, result)
    }
}