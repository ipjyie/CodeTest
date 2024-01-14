class Solution {
    fun solution(numbers: String): Long {
        var answer: Long = 0

        // 각 case를 확인하고 해당 텍스트를 대체
        var modifiedNumbers = numbers
        //replace는 새 문자를 할당하기 때문에 case에서 수정된 문자열을 다시 할당
        if ("one" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("one", "1")
        if ("two" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("two", "2")
        if ("three" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("three", "3")
        if ("four" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("four", "4")
        if ("five" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("five", "5")
        if ("six" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("six", "6")
        if ("seven" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("seven", "7")
        if ("eight" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("eight", "8")
        if ("nine" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("nine", "9")
        if ("zero" in modifiedNumbers) modifiedNumbers = modifiedNumbers.replace("zero", "0")

        // 최종 수정된 문자열을 Long으로 변환
        answer = modifiedNumbers.toLong()

        return answer
    }
}

  
