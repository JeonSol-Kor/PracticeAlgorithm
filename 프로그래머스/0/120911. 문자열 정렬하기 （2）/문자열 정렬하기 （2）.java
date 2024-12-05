import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        for(char a : c){
            sb.append(a);    
        }
        return sb.toString();
    }
}