class Solution {
    fun solution(s: String): Boolean {
        
        var word = s.split("\\s+".toRegex())
        var answer = true
        
        if((s.length == 4 || s.length == 6) && s.all { it.isDigit() } )  answer = true else answer = false
        
        return answer
    }
}