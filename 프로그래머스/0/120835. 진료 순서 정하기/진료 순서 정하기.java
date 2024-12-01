import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;

        Integer[] sortedEmergency = Arrays.stream(emergency)
                                        .boxed().toArray(Integer[]::new);
        Arrays.sort(sortedEmergency, Collections.reverseOrder());

        
        Map<Integer, Integer> emergencyToPriority = new HashMap<>();
        for (int i = 0; i < n; i++) {
            emergencyToPriority.put(sortedEmergency[i], i + 1);
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = emergencyToPriority.get(emergency[i]);
        }

        return answer;
    }
}
