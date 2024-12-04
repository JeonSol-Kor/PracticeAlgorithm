class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();        
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c >= 65 && c <= 90) sb.append((char)(c+32));
            else if(c >= 97 && c <= 122) sb.append((char)(c-32));
        }        
        return sb.toString();
    }
}