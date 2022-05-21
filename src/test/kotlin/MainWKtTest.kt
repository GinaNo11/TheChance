import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

internal class MainWKtTest {

    @Test
    fun shoud_ReturnDoubleValue_when_ListTrue() {
        //give correct list
        val listChars :MutableList<String>? =  mutableListOf("a","b","b")
        //when calculate the percentage of a
        val percentage = percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(33.3 ,percentage)
    }
    @Test
    @Disabled
    fun shoud_ReturnIntValue_when_ListTrue() {
        //give correct list
        val listChars :MutableList<String>? =  mutableListOf("a","b")
        //when calculate the percentage of a
        val percentage = percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(50.0 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_ListNull() {
        //give null list
        val listChars :MutableList<String>? =null
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }
    @Test
    fun shoud_ReturnMinus1_when_ListNOtHaveAandB() {
        //give list not have "A" char & "B" char
        val listChars :MutableList<String>?=  mutableListOf("g","h","j")
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }
    @Test
    fun shoud_ReturnMinus1_when_ListNOtHaveAorB() {
        //give list not have "A" char or "B" char
        val listChars :MutableList<String>?=  mutableListOf("a","h","j")
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_CharIsSpace() {
        //give list have space
        val listChars :MutableList<String>? = mutableListOf( " "," ")
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_EnterNumber() {
        //give list have numbers
        val listChars :MutableList<String>? = mutableListOf("3","7","1")
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }
    @Test
    fun shoud_ReturnMinus1_when_EnterDoubleChar() {
        //give List have double input
        val listChars :MutableList<String>? = mutableListOf("aa","bb","bb")
        //when calculate the percentage of a
        val percentage =  percentageOfChar(charsList = listChars)
        //then check the result
        assertEquals(-1 ,percentage)
    }

}