import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split(" ");
            if(line[0].equals("push")){
                stack.push(Integer.parseInt(line[1]));
            }else if(line[0].equals("pop")){
                if (stack.empty()) sb.append(-1).append('\n');
                else sb.append(stack.pop()).append('\n');
            }else if(line[0].equals("size")){
                sb.append(stack.size()).append('\n');
            }else if(line[0].equals("empty")){
                if (stack.empty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }else if(line[0].equals("top")){
                if (stack.empty()) sb.append(-1).append('\n');
                else sb.append(stack.peek()).append('\n');
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}