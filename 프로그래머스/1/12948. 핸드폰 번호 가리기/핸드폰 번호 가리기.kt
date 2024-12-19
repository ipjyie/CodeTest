class Solution {
    fun solution(phone_number: String): String {
        var charArray = phone_number.toCharArray()
        for (i in 0 until (charArray.size - 4)) {
        charArray[i] = '*'  
    }
        var answer = charArray.joinToString("")
        return answer
    }
}