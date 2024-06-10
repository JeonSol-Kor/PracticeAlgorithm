class Solution {
    public int solution(int a, int b) {
        String check1 = String.valueOf(a) + String.valueOf(b);
        String check2 = String.valueOf(b) + String.valueOf(a);
        int num1 = Integer.parseInt(check1);
        int num2 = Integer.parseInt(check2);
        int answer = num1 > num2 ? num1 : num2;
        return answer;
    }
}