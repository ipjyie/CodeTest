package org.example

fun main() {

    var blackpiececount = arrayOf(1, 1, 2, 2, 2, 8)
    var whitepiececount = readLine()!!.split(" ").map { it.toInt() }
    var count = arrayOf<Int>()



    for(i in blackpiececount.indices){
        if(blackpiececount[i]>=whitepiececount[i]){
            val diff = (blackpiececount[i]-whitepiececount[i])
            count += diff
        }else{
            val diff = ((whitepiececount[i]-blackpiececount[i])*(-1))
            count += diff
        }
    }
 
    println(count.joinToString(" "))
}