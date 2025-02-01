class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalCost = 0L

        // count만큼 price * i를 누적
        (1..count).forEach { i -> totalCost += price * i }

        var answer = if (money >= totalCost) 0 else totalCost - money
        return answer
    }
}
