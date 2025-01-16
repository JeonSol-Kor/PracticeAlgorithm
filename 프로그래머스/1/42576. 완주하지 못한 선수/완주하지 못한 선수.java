import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String per : participant) {
            map.put(per, map.getOrDefault(per, 0) + 1);
        }
        for (String g : completion) {
            map.replace(g, map.get(g) - 1);
            if(map.get(g) == 0) map.remove(g);
        }
        for(String r : map.keySet()) {
            answer = r;
        }
        return answer;
    }
}