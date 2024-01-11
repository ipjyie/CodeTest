class Solution {
    fun solution(numList: IntArray): Int {
        var answer: Int = 0
        var sum: Int = 0
        var mul: Int = 1 // 초기값을 1로 설정

        if (numList.size >= 11) {
            for (i in numList.indices) {
                sum += numList[i]
            }
            answer = sum
        } else {
            for (i in numList.indices) {
                mul *= numList[i]
            }
            answer = mul
        }
        return answer
    }
}
