import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c == 'a' || c == 'i' || c == 'o' || c == 'e' || c == 'u') continue;
            sb.append(c);
        }
        return sb.toString();
    }
}