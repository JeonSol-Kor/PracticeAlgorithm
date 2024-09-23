import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 각 문자가 입력될 수 있는 최소 횟수를 저장할 Map
        Map<Character, Integer> minPressCount = new HashMap<>();

        // keymap을 순회하면서 각 문자에 대해 최소 누름 횟수 계산
        for (int i = 0; i < keymap.length; i++) {
            String key = keymap[i];
            for (int j = 0; j < key.length(); j++) {
                char c = key.charAt(j);
                int pressCount = j + 1; // 누름 횟수는 1부터 시작

                // 이미 존재하는 문자라면 더 작은 값을 저장
                if (minPressCount.containsKey(c)) {
                    minPressCount.put(c, Math.min(minPressCount.get(c), pressCount));
                } else {
                    minPressCount.put(c, pressCount);
                }
            }
        }

        // 결과를 저장할 배열
        int[] result = new int[targets.length];

        // 각 target 문자열에 대해 최소 키 누름 횟수를 계산
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int pressTotal = 0;

            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);

                // 해당 문자를 입력할 수 없는 경우 -1 저장
                if (!minPressCount.containsKey(c)) {
                    pressTotal = -1;
                    break;
                }

                // 입력할 수 있는 경우 최소 누름 횟수를 더해줌
                pressTotal += minPressCount.get(c);
            }

            result[i] = pressTotal;
        }

        return result;
    }
}