import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }

    val basketArray = IntArray(N)

    for (p in 1..M) {
        val (i, j, k) = readLine()!!.split(" ").map { it.toInt() }

        for (index in i - 1 until j) {

                basketArray[index] = k

        }

        for (index in 0 until basketArray.size) {
            if (basketArray[index] == 0) {
                basketArray[index] = 0
            }
        }

        
    }

    println(basketArray.joinToString(" "))
}
