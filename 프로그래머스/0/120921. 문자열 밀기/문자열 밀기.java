import java.util.*;

class Solution {
    public int solution(String A, String B) {
        if(A.equals(B)) return 0;
        int len = A.length();
        String C = A;
        for(int i = 1; i < len; i++){
            C = C.substring(len - 1) + C.substring(0, len - 1);
            if(C.equals(B)) return i;
        }
        return -1;
    }
}