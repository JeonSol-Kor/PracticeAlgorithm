import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            deque.offer(new int[] { i + 1, Integer.parseInt(input[i]) });
        }

        StringBuilder result = new StringBuilder();

        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            result.append(current[0]).append(" ");
            int steps = current[1];

            if (deque.isEmpty())
                break;

            if (steps > 0) {
                for (int i = 1; i < steps; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else {
                for (int i = 0; i < -steps; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }

        System.out.println(result.toString().trim());
    }
}