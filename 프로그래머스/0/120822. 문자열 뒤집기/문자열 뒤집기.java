class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int n = my_string.length();
        for (int i = 0; i < n; i++) {
            sb.append(my_string.charAt(n-i-1));
        }
        String answer = sb.toString();
        return answer;
    }
}