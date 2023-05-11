package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun roller_can_Roll(){
     val dice= Dice(6)
     val rolResults = dice.roll()
     assertTrue("The value of the rolResults was not between 1 and 6", rolResults in 1..6)
     assertTrue("is range of 3", rolResults in 1..3)
    }


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}