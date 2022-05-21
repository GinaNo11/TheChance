import java.util.*
import kotlin.math.roundToInt

fun main() {


//
//    val number:Double = 33.5
//    val number3digits:Double = String.format("%.3f", number).toDouble()
//    val number2digits:Double = String.format("%.2f", number3digits).toDouble()
//    val solution:Double = String.format("%.1f", number).toDouble()
//
//    println("kkkkkkkkkkkkkk $solution")
//    println("kkkkkkkkkkkkkk $number3digits")
//    println("kkkkkkkkkkkkkk $number2digits")


    val charList: MutableList<String>? = mutableListOf()
    var charList2: MutableList<Int> = mutableListOf(3,7,9,2)
    charList2.sort()
    println(charList2[charList2.size-1])

    print("pls ,inter the size of how many characters yor want to enter : ")
    val sizeChar: Int = readLine()!!.toInt()

    print("\npls ,inter the characters : ")
    for (i in 1..sizeChar) {
        charList?.add(readLine()!!.toString())
    }

    var result =  percentageOfChar(charsList = charList)
    println("result is ${result}")



}

fun percentageOfChar(charsList :MutableList<String>?): Any  {
    if(charsList !=null) {

        var check  = true
        for ( i in 0 until charsList.size){
            if (charsList[i].uppercase() != "A" && charsList[i].uppercase() != "B")
                check = false
            //  break
        }
        if( check) {
            var countChar: Int =0
            for ( i in 0 until charsList.size){
                if (charsList[i].uppercase() =="A")
                    countChar++
            }

            return    (String.format("%.1f", countChar / (charsList.size+.0) * 100).toDouble())
        }
        else  return -1

    }
    else return  -1
}

