import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine().trim());

        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for(int i = 3; i < 11; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for(int t = 0; t < T; t++){
            bw.write(String.valueOf(dp[Integer.parseInt(br.readLine().trim())-1]) + '\n');
        }

		bw.flush();
		bw.close();
		br.close();
	}
}