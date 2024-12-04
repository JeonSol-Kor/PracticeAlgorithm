import java.util.*;

class Solution {
    public int[] solution(int n) {
        boolean[] prime = new boolean[n+1];
        for(int i = 2; i * i <= n; i++){
            if(!prime[i]){
                for(int j = i * i; j <= n; j += i){
                    prime[j] = true;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 2; i <= n; i++){
            if(!prime[i] && n % i == 0) result.add(i);
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}