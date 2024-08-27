import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if(n == 1){
            System.out.println(1);
        }else if(n == 2){
            System.out.println(3);
        }else{
            long[] dp = new long[n];
            dp[0] = 1;
            dp[1] = 3;
            for(int i = 2; i < n; i++){
                dp[i] = (dp[i-1]+ (dp[i-2] * 2 % 10007)) % 10007;
            }
            System.out.println(dp[n-1]);
        }
	}
}