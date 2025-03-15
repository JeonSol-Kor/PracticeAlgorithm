class Solution {
    public String solution(String my_string, String alp) {
        int len = my_string.length();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < len; i++){
            char c = my_string.charAt(i);
            if(c == alp.charAt(0) ) c -= 32;
            answer.append(c);
        }
        return answer.toString();
    }
}