class Solution {
    fun solution(n: Int): Int {
             return n.toString().map { it - '0' }.sum()
    }
}