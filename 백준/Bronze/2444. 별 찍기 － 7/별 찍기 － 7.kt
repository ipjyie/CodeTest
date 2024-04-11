package org.example

fun main() {
    val starLines = readLine()!!.toInt()

    // 위쪽 삼각형 출력
    for (i in 1..starLines) {
        for (j in 1..starLines - i) {
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }
        println()
    }

    // 아래쪽 삼각형 출력
    for (i in starLines - 1 downTo 1) {
        for (j in 1..starLines - i) {
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}
