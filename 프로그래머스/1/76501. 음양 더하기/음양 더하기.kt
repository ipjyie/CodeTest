class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        
       
        
       for (i in 0 until absolutes.size) {
            absolutes[i] = if (signs[i]) absolutes[i] else absolutes[i]*-1 
            answer += absolutes[i]
        }
        
                
        return answer
    }
}