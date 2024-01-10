class Solution {
    fun solution(n: Int): Int {
        /**
         * 나머지가 존재: 약수가 아님
         * 1 < x < n
         */

        var answer: Int = 0
        var numList = mutableListOf<Int>() // 배열을 리스트로 변경
        var min: Int = 0

        for (i in 2 until n) { // i가 1인 경우는 제외
            if (n % i != 0 && n > i) {
                if (n % i == 1) {
                    numList.add(i)
                    break
                }
            }
        }

        if (numList.isNotEmpty()) {
            min = numList[0]

            for (i in 1 until numList.size) {
                min = if (numList[i] <= numList[i - 1]) {
                    numList[i]
                } else {
                    numList[i - 1]
                }
            }
        }

        return min
    }
}
