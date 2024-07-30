import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] command = line.split(" ");
            
            if (command[0].equals("push")) {
                queue.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.poll()).append('\n');
                }
            } else if (command[0].equals("size")) {
                sb.append(queue.size()).append('\n');
            } else if (command[0].equals("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (command[0].equals("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(queue.peek()).append('\n');
                }
            } else if (command[0].equals("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(((LinkedList<Integer>) queue).peekLast()).append('\n');
                }
            }
        }
        
        System.out.print(sb.toString());
    }
}
