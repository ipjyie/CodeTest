class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var diff : Int = 0
        
        for(i in 0 until numLog.size-1){
            diff = numLog[i]-numLog[i+1]
            when (diff) {
                -1 -> answer = answer.plus("w")
                1 -> answer = answer.plus("s")
                -10 -> answer = answer.plus("d")
                10 -> answer = answer.plus("a")
            }
        }
                
        return answer
    }
}