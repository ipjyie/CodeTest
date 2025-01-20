fun main(){
    var (A, B) = readLine()!!.trim().split(" ").map { it.toInt() }
    var array = Array<Int>(5) { 0 }
    
    array[0] = A+B
    array[1] = A-B
    array[2] = A*B
    array[3] = A/B
    array[4] = A%B
    
    array.forEach { println(it) }
    
}