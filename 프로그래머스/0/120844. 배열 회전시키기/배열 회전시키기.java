import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] answer = new int[n];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0; i < n; i++){
            deque.offer(numbers[i]);
        }
        if (direction.equals("right")) {
            deque.offerFirst(deque.pollLast());
        } else {
            deque.offer(deque.poll());
        }
        for(int i = 0; i < n; i++){
            answer[i] = deque.poll();
        }
        return answer;
    }
}