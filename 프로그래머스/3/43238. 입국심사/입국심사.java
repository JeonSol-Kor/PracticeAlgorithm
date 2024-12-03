import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long end = (long) times[0] * n;
        long start = 0;    
        long answer = 0;
        while(start <= end){
            long mid = (start + end) / 2;
            long people = 0;
            
            for(int time : times){
                people += mid / time;
            }
            // System.out.println("start : " + start +", end : " + end +", mid : " + mid +", people :"+ people);
            if(people >= n){
                answer = mid;
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return answer;
    }
}