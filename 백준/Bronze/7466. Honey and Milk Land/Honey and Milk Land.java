import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        
        int result = 0;
        if(n == 1){
            if(e != 1){
                br.readLine();
                st = new StringTokenizer(br.readLine().trim());
                for(int i = 0; i < e - 1; i++){
                    result += Integer.parseInt(st.nextToken());
                }
            }
        }else{
            if(e == 1){
                st = new StringTokenizer(br.readLine().trim());
                for(int i = 0; i < n - 1; i++){
                    result += Integer.parseInt(st.nextToken());
                }
            }else{
                int xSum = 0;
                st = new StringTokenizer(br.readLine().trim());
                for(int i = 0; i < n - 1; i++){
                    xSum += Integer.parseInt(st.nextToken());
                }
                int ySum = 0;
                st = new StringTokenizer(br.readLine().trim());
                for(int i = 0; i < e - 1; i++){
                    ySum += Integer.parseInt(st.nextToken());
                }
                result = (int) Math.sqrt((double) xSum * xSum + ySum * ySum);
                if(result * result < xSum * xSum + ySum * ySum){
                    result++;
                }
            }
        }
        br.close();
        System.out.println(result);
    }
}