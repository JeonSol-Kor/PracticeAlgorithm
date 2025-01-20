import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
            List<Integer> cutArr = new ArrayList<>();
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                cutArr.add(array[j]);
            }
            Collections.sort(cutArr);
            answer[i] = cutArr.get(commands[i][2] - 1);
        }
        
        return answer;
    }
}