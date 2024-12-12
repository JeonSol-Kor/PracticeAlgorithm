import java.util.*;

public class Solution {
    public int[] solution(int[] numlist, int n) {
        // Integer 배열로 변환하여 List로 다루기 편하게 함
        Integer[] numListInteger = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        // 커스텀 Comparator 정의
        Arrays.sort(numListInteger, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int distanceA = Math.abs(a - n);
                int distanceB = Math.abs(b - n);
                
                if (distanceA != distanceB) {
                    // 거리가 다르면 거리 순으로 오름차순
                    return distanceA - distanceB;
                } else {
                    // 거리가 같으면 큰 수가 먼저 오도록 내림차순
                    return b - a;
                }
            }
        });
        
        // 다시 int 배열로 변환
        return Arrays.stream(numListInteger).mapToInt(Integer::intValue).toArray();
    }
}
