class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        for (i in 0 until n) {
            answer++
            while (answer % 3 == 0 || answer.toString().contains("3")) {
                answer++
            }
        }
        return answer
    }
}