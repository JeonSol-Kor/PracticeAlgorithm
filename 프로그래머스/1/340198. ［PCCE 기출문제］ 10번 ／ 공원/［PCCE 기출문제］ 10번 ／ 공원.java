import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        int rows = park.length, cols = park[0].length;

        for (int size = mats.length - 1; size >= 0; size--) {
            int matSize = mats[size];
            for (int i = 0; i <= rows - matSize; i++) {
                for (int j = 0; j <= cols - matSize; j++) {
                    boolean canPlace = true;
                    for (int x = i; x < i + matSize; x++) {
                        for (int y = j; y < j + matSize; y++) {
                            if (!park[x][y].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if (!canPlace) break;
                    }
                    if (canPlace) return matSize;
                }
            }
        }
        return -1;
    }
}
