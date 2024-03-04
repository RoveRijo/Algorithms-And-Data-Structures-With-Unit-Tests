package com.example.algorithmsanddatastructureswithtests

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class BubbleSortTests {
    @Test
    fun bubbleSortCase1() {
        // Testing Array [3,0,4,5,87,45,1]
        val arrayIn= arrayOf(3,0,4,5,87,45,1)
        val output = bubbleSort(arrayIn)
        assertArrayEquals(output,arrayOf(0,1,3,4,5,45,87))
    }

    @Test
    fun bubbleSortCase2() {
        // Testing Array [2,4,5,4,87,516,5,4,54,878,78,75,54,5,6,46545,45,75,15,4,4,0,6,5,66]
        val arrayIn= arrayOf(2,4,5,4,87,516,5,4,54,878,78,75,54,5,6,46545,45,75,15,4,4,0,6,5,66)
        val output = bubbleSort(arrayIn)
        assertArrayEquals(output,arrayOf(0,2,4,4,4,4,4,5,5,5,5,6,6,15,45,54,54,66,75,75,78,87,516,878,46545))
    }

}