import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        int big = 0;
        for(int i = 0; i < T; i++){
            int n = Integer.parseInt(br.readLine().trim());
            big = n;
            while(n > 1){
                if(n % 2 == 0){
                    n /= 2;
                }else{
                    n = 3 * n + 1;
                    if(n > big){
                        big = n;
                    }
                }
            }
            sb.append(big).append("\n");
        }
        br.close();
        System.out.print(sb.toString());
    }
}