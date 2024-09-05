import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] nums = new int[N];
        st  = new StringTokenizer(br.readLine().trim());
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int max = -300;

        for(int i = K - 1; i < N; i++){
            int sum = 0;
            for(int j = 0; j < K; j++){
                sum += nums[i - j];
            }
            if(sum > max) max = sum;
        }
        System.out.println(max);
    }
}