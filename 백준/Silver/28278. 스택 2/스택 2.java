import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> xList = new Stack<>();

        for(int i = 0; i < N; i++){
            String order = br.readLine();
            if(order.charAt(0) == '1'){
                StringTokenizer st = new StringTokenizer(order);
                String A = st.nextToken();
                int X = Integer.parseInt(st.nextToken());
                xList.push(X);
            }else if(order.charAt(0) == '2'){
                if (xList.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(xList.pop());
                }
            }else if(order.charAt(0) == '3'){
                System.out.println(xList.size());
            }else if(order.charAt(0) == '4'){
                if (xList.isEmpty()) {
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(order.charAt(0) == '5'){
                if (xList.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(xList.peek());
                }
            }
        }
        br.close();
    }
}