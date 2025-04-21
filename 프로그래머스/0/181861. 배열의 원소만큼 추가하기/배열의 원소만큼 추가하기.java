import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int num : arr){
            for(int i = 0; i < num; i++){
                newArr.add(num);
            }
        }
        int[] answer = new int[newArr.size()];
        for(int i = 0; i < newArr.size(); i++){
            answer[i] = newArr.get(i);
        }
        return answer;
    }
}