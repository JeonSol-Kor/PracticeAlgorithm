import java.util.*;

class Solution {
    public int solution(int[] numbers, int k) {
        int len = numbers.length;
        int idx = 0;
        if (len % 2 == 0) {
            idx = (k % (len / 2)) * 2 - 2;
            if(idx < 1) idx = len - 2;
        } else {
            int r = k % len;
            if(r <= len / 2 + 1){
                idx = r * 2 - 2;
                if(idx < 1) idx = len - 2;
            }else{
                r -= len / 2 + 1;
                idx = r * 2 - 1;
                if(idx < 1) idx = len - 1;
            }
        }
        
        return numbers[idx];
    }
}