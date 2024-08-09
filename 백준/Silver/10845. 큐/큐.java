import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());

        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            if(line[0].equals("push")){
                queue.offerLast(Integer.parseInt(line[1]));
            }else if(line[0].equals("pop")){
                if (queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.pollFirst()).append('\n');
            }else if(line[0].equals("size")){
                sb.append(queue.size()).append('\n');
            }else if(line[0].equals("empty")){
                if (queue.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }else if(line[0].equals("front")){
                if (queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.peekFirst()).append('\n');
            }else if(line[0].equals("back")){
                if (queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.peekLast()).append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}