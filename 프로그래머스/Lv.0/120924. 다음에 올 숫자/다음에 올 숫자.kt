class Solution {
    fun solution(common: IntArray): Int {
        
        //등차수열인지 등비수열인지 우선적으로 확인
        //그 다음 이후 수 출력
        var answer: Int = 0
        var diff : Int = 0
     
        
        
       
        for(i in 0 until common.size-2){
            //i의 범위를 0부터 common 크기의 -2까지 제한해서 인덱스 오류 방지
            if(common[i+2]-common[i+1] == common[i+1]-common[i]){
                diff = common[i+2] - common[i+1]
                answer = common.last() + diff
                //
            }else{
              diff = common[i+2] / common[i+1]
                answer = common.last() * diff
            }
        }    
      
        
        
        return answer
    }
}