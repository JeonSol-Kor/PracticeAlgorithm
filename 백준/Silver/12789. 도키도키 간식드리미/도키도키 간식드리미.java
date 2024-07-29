import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();
        int expected = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == expected) {
                expected++;
                // Check stack for additional items
                while (!stack.isEmpty() && stack.peek() == expected) {
                    stack.pop();
                    expected++;
                }
            } else {
                if (stack.isEmpty() || stack.peek() > current) {
                    stack.push(current);
                } else {
                    System.out.println("Sad");
                    return;
                }
            }
        }

        // Check if remaining items in stack are in correct order
        while (!stack.isEmpty()) {
            if (stack.pop() != expected) {
                System.out.println("Sad");
                return;
            }
            expected++;
        }

        System.out.println("Nice");
    }
}
