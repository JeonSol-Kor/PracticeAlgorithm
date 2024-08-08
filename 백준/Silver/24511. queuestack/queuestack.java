import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] C = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> queues = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            if(A[i] == 0) queues.offerFirst(B[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int value : C){
            queues.offerLast(value);
            sb.append(queues.pollFirst()).append(" ");
        }

        bw.write(sb.toString().trim());
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}