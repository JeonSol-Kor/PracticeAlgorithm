import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        if(n < 1){
            System.out.println(0);
        }else{
            int[] scores = new int[n];
            for(int i = 0; i < n; i++){
                scores[i] = Integer.parseInt(br.readLine().trim());
            }
            br.close();
    
            Arrays.sort(scores);

            int exclusion = (int) Math.round(n * 0.15);
            int sum = 0;
            for(int i = (0 + exclusion); i < (n - exclusion); i++){
                sum += scores[i];
            }
            int avg = (int) Math.round((double) sum / (double)(n - (2 * exclusion)));

            System.out.println(avg);
        }
    }
}