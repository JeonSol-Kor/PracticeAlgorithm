import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] no1 = {1, 2, 3, 4, 5};
        int[] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int ans1 = 0, ans2 = 0, ans3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == no1[i % 5]) ans1++;
            if(answers[i] == no2[i % 8]) ans2++;
            if(answers[i] == no3[i % 10]) ans3++;
        }
        int max = Math.max(Math.max(ans1, ans2), ans3);
        List<Integer> result = new ArrayList<>();
        
        if(max == ans1) result.add(1);
        if(max == ans2) result.add(2);
        if(max == ans3) result.add(3);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}