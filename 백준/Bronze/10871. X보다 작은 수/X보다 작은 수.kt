import java.util.Scanner
fun main(){

    val (N, X) = readLine()!!.split(" ").map { it.toInt() }
    var A = readLine()!!.split(" ").map { it.toInt() }
    var answerArray = ArrayList<Int>(N)

    for(numbers in A){
        if(numbers < X ) {
            answerArray.add(numbers)
        }
    }

    println(answerArray.joinToString(" "))
}