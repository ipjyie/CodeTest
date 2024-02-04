class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var numArray = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        var numalfArray = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var mutableS = s
        
          for (i in numArray.indices) {
            if (s.contains(numalfArray[i])) {
               mutableS = mutableS.replace(numalfArray[i], numArray[i].toString())
            }
        }
        
        answer = mutableS.toInt()
        
    
        
        return answer
    }
}