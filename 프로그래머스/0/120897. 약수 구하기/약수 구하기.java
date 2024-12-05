import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> yak = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) yak.add(i);
        }
        int[] answer = new int[yak.size()];
        for(int i = 0; i < yak.size(); i++){
            answer[i] = yak.get(i);
        }
        return answer;
    }
}