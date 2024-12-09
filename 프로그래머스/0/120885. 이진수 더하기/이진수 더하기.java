class Solution {
    public String solution(String bin1, String bin2) {
        // 2진수 형태의 문자열을 10진수 정수로 변환
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        // 두 수의 합
        int sum = num1 + num2;
        
        // 합을 다시 2진수 문자열로 변환
        return Integer.toBinaryString(sum);
    }
}