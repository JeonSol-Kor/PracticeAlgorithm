class Solution {
    public int solution(int a, int b) {
        String check1 = String.valueOf(a) + String.valueOf(b);
        int num1 = Integer.parseInt(check1);
        int num2 = 2 * a * b;
        int answer = num1 > num2 ? num1 : num2;
        return answer;
    }
}