import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        
        long[] sums = new long[N+1];  
        sums[0] = 0;
        long sum = 0;
        
        for(int i = 1; i < N + 1; i++){
            long num = Long.parseLong(st.nextToken());
            sum += num;
            sums[i] = sum;
        }
        
        for(int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine().trim());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            result.append(sums[j] - sums[i-1]).append('\n');
        }

        bw.write(result.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}