import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.add(new int[]{j, priority});
                priorityQueue.add(priority);
            }

            int printOrder = 0;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int currentIndex = current[0];
                int currentPriority = current[1];

                if (currentPriority == priorityQueue.peek()) {
                    priorityQueue.poll();
                    printOrder++;
                    if (currentIndex == m) {
                        sb.append(printOrder).append("\n");
                        break;
                    }
                } else {
                    queue.add(current);
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
