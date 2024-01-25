class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        
        for(i in 0 until s1.size){
            for(j in 0 until s2.size){
                if(s1[i].equals(s2[j])){
                    answer += 1
                }
            }
        }
               
        
        return answer
    }
}