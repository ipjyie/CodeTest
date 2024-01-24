class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
     var answer = IntArray(arr.size)

        for (i in 0 until arr.size) {
            if (arr.size % 2 != 0) {
                answer[i] = if (i % 2 == 0) arr[i] + n else arr[i]
            } else {
                answer[i] = if (i % 2 != 0) arr[i] + n else arr[i]
            }
        }

    
        return answer
    }
}