import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
                
        HashMap<String, ArrayList<String>> hashMap = arrayToHashMap(clothes);
        answer = countCombinations(hashMap);

        return answer;
    }

    protected int countCombinations(HashMap<String, ArrayList<String>> hashMap) {
        int totalCombinations = 1;

        for (ArrayList<String> clothingList : hashMap.values()) {
            totalCombinations *= (clothingList.size() + 1);
        }

        return totalCombinations - 1;
    }

    protected HashMap<String, ArrayList<String>> arrayToHashMap(String[][] array) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (String[] pair : array) {
            String key = pair[1];
            String value = pair[0];

            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(value);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(value);
                hashMap.put(key, list);
            }
        }

        return hashMap;
    }
}
