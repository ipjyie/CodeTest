class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num1 = n.toString(3)
        var num2 = num1.reversed()   
        answer = num2.toInt(3)
        return answer
    }
}