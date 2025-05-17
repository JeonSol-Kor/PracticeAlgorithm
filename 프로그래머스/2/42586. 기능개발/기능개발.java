import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        int[] result = new int[len];
        int cnt = 0;
        int max = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < len; i++){
            result[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            // System.out.println(result[i]);
            if(i == 0){
                max = result[i];
                cnt++;
            }else if (result[i] > max){
                ans.add(cnt);
                // System.out.println("result["+i+"] : "+result[i]+", cnt : " + cnt);
                cnt = 1;
                max = result[i];
            } else{
                cnt++;
            }
        }
        ans.add(cnt);
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    }
}