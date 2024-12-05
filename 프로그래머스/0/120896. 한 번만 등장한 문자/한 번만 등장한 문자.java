class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        for(int i = 'a'; i <= 'z'; i++){
            int cnt = 0;
            for(int j = 0; j < s.length(); j++){
                if((char)i == s.charAt(j)) cnt++;
                if(cnt > 2) break;
            }
            if(cnt == 1) answer.append((char) i);
        }
        return answer.toString();
    }
}