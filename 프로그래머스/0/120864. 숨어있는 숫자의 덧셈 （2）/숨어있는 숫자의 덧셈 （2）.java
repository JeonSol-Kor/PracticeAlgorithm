public class Solution {
    public int solution(String my_string) {
        int sum = 0;  // 합을 저장할 변수
        int currentNum = 0;  // 현재 숫자 (연속된 숫자들)
        
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                // 숫자라면 currentNum에 더해서 쌓음
                currentNum = currentNum * 10 + (ch - '0');
            } else {
                // 숫자가 끝났다면 합에 더하고 currentNum 초기화
                sum += currentNum;
                currentNum = 0;
            }
        }
        
        // 마지막에 남아있는 숫자가 있을 수 있기 때문에 한번 더 더해줌
        sum += currentNum;
        
        return sum;
    }
}