
fun main() {
    val charList: MutableList<String>? = mutableListOf()
    print("pls ,inter the size of how many characters yor want to enter : ")
    val sizeChar: Int = readLine()!!.toInt()

    print("\npls ,inter the characters : ")
    for (i in 1..sizeChar)
        charList?.add(readLine()!!.toString())


    println("result is ${percentageOfChar(charsList = charList)}")

}

fun percentageOfChar(charsList :MutableList<String>?): Any  {
    if(charsList !=null) {
        var checkIsTruthInput  = true
        for ( i in 0 until charsList.size){
            if (charsList[i].uppercase() != "A" && charsList[i].uppercase() != "B")
                checkIsTruthInput = false
            //  break
        }
        if( checkIsTruthInput) {
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

