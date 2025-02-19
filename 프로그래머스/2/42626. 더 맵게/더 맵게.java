import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int sc : scoville){
            heap.offer(sc);
        }
        int answer = 0;
        
        while(heap.size() > 1){
            int min = heap.poll();
            if(min >= K) return answer;
            
            int minSec = heap.poll();
            int newFood = min + minSec * 2;
            
            heap.offer(newFood);
            answer++;
        }
        
        if(heap.poll() > K) return answer;
        
        return -1;
    }
}