import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        // 1. 각 학생의 합계 점수를 구한다.
        int[] sums = new int[n];
        for (int i = 0; i < n; i++) {
            sums[i] = score[i][0] + score[i][1];
        }

        // 2. 합계 점수를 복사한 배열을 만든 뒤, 내림차순 정렬한다.
        int[] sortedSums = sums.clone();
        Arrays.sort(sortedSums);
        // 오름차순 정렬이므로 뒤집어서 내림차순으로 만든다.
        for (int i = 0; i < n / 2; i++) {
            int temp = sortedSums[i];
            sortedSums[i] = sortedSums[n - 1 - i];
            sortedSums[n - 1 - i] = temp;
        }

        // 3. 순위를 매긴다.
        Map<Integer, Integer> rankMap = new HashMap<>();
        int currentRank = 1;
        for (int i = 0; i < n; i++) {
            int sum = sortedSums[i];
            if (!rankMap.containsKey(sum)) {
                rankMap.put(sum, currentRank);
            }
            currentRank = i + 2;
        }

        // 4. 원래 순서대로 각 학생의 합 점수에 해당하는 등수를 결과 배열에 담는다.
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = rankMap.get(sums[i]);
        }

        return answer;
    }
}