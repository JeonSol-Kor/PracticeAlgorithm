import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);
        
        Set<Integer> commonSet = new HashSet<>(lostSet);
        commonSet.retainAll(reserveSet);
        lostSet.removeAll(commonSet);
        reserveSet.removeAll(commonSet);
        
        List<Integer> sortedReserve = new ArrayList<>(reserveSet);
        Collections.sort(sortedReserve);
        
        for (int r : sortedReserve) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        
        int answer = n - lostSet.size();
        
        return answer;
    }
}