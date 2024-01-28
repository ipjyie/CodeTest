import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 참가자 이름과 출현 횟수를 기록할 HashMap 생성
        HashMap<String, Integer> participantCount = new HashMap<>();

        // 참가자 이름과 출현 횟수 기록
        for (String p : participant) {
            participantCount.put(p, participantCount.getOrDefault(p, 0) + 1);
        }

        // 완주자 이름과 출현 횟수 빼기
        for (String c : completion) {
            participantCount.put(c, participantCount.get(c) - 1);
        }

        // 출현 횟수가 1인 참가자 찾기
        for (String p : participant) {
            if (participantCount.get(p) == 1) {
                answer = p;
                break;
            }
        }

        return answer;
    }
}
