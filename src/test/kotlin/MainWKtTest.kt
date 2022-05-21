import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

internal class MainWKtTest {

    @Test
    fun shoud_ReturnDoubleValue_when_ListTrue() {
        //give
        val listChars :MutableList<String>? =  mutableListOf("a","b","b")
        //when
        val percentage = percentageOfChar(charsList = listChars)
        //then
        assertEquals(33.3 ,percentage)
    }
    @Test
    @Disabled
    fun shoud_ReturnIntValue_when_ListTrue() {
        //give
        val listChars :MutableList<String>? =  mutableListOf("a","b")
        //when
        val percentage = percentageOfChar(charsList = listChars)
        //then
        assertEquals(50.0 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_ListNull() {
        //give null list
        val listChars :MutableList<String>? =null
        //when
        //val percentage = listChars?.let { percentageOfChar(charsList = it) }
        val percentage =  percentageOfChar(charsList = listChars)
        //then
        assertEquals(-1 ,percentage)
    }
    @Test
    fun shoud_ReturnMinus1_when_CharIsNotAOrB() {
        //give null list
        val listChars :MutableList<String>?=  mutableListOf("g","h","j")
        //when
        val percentage =  percentageOfChar(charsList = listChars)
        //then
        assertEquals(-1 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_CharIsSpace() {
        //give null list
        val listChars :MutableList<String>? = mutableListOf( " "," ")
        //when
        val percentage =  percentageOfChar(charsList = listChars)
        //then
        assertEquals(-1 ,percentage)
    }

    @Test
    fun shoud_ReturnMinus1_when_EnterNumber() {
        //give null list
        val listChars :MutableList<String>? = mutableListOf("3","7","1")
        //when
        val percentage =  percentageOfChar(charsList = listChars)
        //then
        assertEquals(-1 ,percentage)
    }
    @Test
    fun shoud_ReturnMinus1_when_EnterDoubleChar() {
        //give List have double char
        val listChars :MutableList<String>? = mutableListOf("aa","bb","bb")
        //when
        val percentage =  percentageOfChar(charsList = listChars)
        //then
        assertEquals(-1 ,percentage)
    }

}