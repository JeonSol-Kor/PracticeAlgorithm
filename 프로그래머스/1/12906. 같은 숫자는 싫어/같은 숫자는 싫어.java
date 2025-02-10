import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> nums = new LinkedList<>();
        for (int num : arr){
            if(nums.isEmpty() || nums.peekLast() != num){
                nums.offerLast(num);
            }
        }
        
        int numSize = nums.size();
        int[] answer = new int[numSize];
        for(int i = 0; i < numSize; i++){
            answer[i] = nums.pollFirst();
        }
        return answer;
    }
}