import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < N; i++){
            String[] command = br.readLine().split(" ");
            if(command[0].equals("1")){
                dq.offerFirst(Integer.parseInt(command[1]));
            }else if(command[0].equals("2")){
                dq.offerLast(Integer.parseInt(command[1]));
            }else if(command[0].equals("3")){
                if(!dq.isEmpty()){
                    sb.append(dq.pollFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command[0].equals("4")){
                if(!dq.isEmpty()){
                    sb.append(dq.pollLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command[0].equals("5")){
                sb.append(dq.size()).append("\n");
            }else if(command[0].equals("6")){
                if(dq.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                    
                }
            }else if(command[0].equals("7")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(command[0].equals("8")){
                if(!dq.isEmpty()){
                    sb.append(dq.peekLast()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}
