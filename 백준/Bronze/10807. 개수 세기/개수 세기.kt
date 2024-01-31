import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val numberArray = IntArray(N)

    for (i in 0 until N) {
        numberArray[i] = scanner.nextInt()
    }

    val v = scanner.nextInt()
    var sum = 0

    for (number in numberArray) {
        if (number == v) {
            sum++
        }
    }

    println(sum)
    scanner.close()
}