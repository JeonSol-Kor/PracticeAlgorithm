class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // 주어진 조건에 따라 문자열을 자르고 새로운 문자열로 조합
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}