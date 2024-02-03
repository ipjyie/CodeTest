package main.kotlin

import java.util.*
import kotlin.collections.ArrayList

fun main() {
   var scanner = Scanner(System.`in`)
   var numList = ArrayList<Int>()
   var max = Int.MIN_VALUE
   var maxIndex = -1

    for(i in 0 .. 8) {
        numList.add(scanner.nextInt())
    }
    for (i in numList.indices) {
        if (numList[i] > max) {
            max = numList[i]
            maxIndex = i+1
        }
    }

    println(max)
    println(maxIndex)



}