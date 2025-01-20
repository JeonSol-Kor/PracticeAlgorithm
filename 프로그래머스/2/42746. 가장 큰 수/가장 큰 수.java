import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int len = numbers.length;
        String[] strNums = new String[len];
        for (int i = 0; i < len; i++) {
            strNums[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNums, (a, b) -> (b+a).compareTo(a+b));
        
        StringBuilder answer = new StringBuilder();
        for(String strNum : strNums){
            answer.append(strNum);
        }
        if (answer.toString().charAt(0) == '0') return "0";
        return answer.toString();
    }
}