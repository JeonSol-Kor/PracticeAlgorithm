import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine().trim());
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine().trim());
            
            if (x == 0) {
                if (minHeap.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(minHeap.poll()).append('\n');
                }
            } else {
                minHeap.add(x);
            }
        }
        
        System.out.print(sb.toString());
        br.close();
    }
}