import java.util.*;

public class Solution {
    private static final String[] PRONUNCIATIONS = {"aya", "ye", "woo", "ma"};

    public int solution(String[] babbling) {
        int count = 0;
        for (String word : babbling) {
            if (canPronounce(word)) count++;
        }
        return count;
    }

    private boolean canPronounce(String word) {
        boolean[] used = new boolean[PRONUNCIATIONS.length];
        return match(word, 0, used);
    }
    private boolean match(String word, int index, boolean[] used) {
        if (index == word.length()) {
            return true;
        }

        for (int i = 0; i < PRONUNCIATIONS.length; i++) {
            String pron = PRONUNCIATIONS[i];
            if (!used[i] && word.startsWith(pron, index)) {
                used[i] = true;
                if (match(word, index + pron.length(), used)) return true;
                used[i] = false;
            }
        }
        return false;
    }
}
