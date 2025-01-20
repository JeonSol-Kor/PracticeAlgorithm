import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int len = citations.length;
        Arrays.sort(citations);  // 인용 수를 오름차순으로 정렬
        for (int i = 0; i < len; i++) {
            if (citations[len - 1 - i] < i + 1) {
                return i;  // 조건을 만족하는 최대 H-Index
            }
        }
        return len;  // 모든 논문이 H-Index에 포함되면 len이 H-Index
    }
}
