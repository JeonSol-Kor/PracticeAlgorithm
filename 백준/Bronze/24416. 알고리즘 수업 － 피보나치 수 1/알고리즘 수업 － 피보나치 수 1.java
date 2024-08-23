import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine().trim());

        int[] fibCount = new int[n];
        fibCount[0] = 1;
        fibCount[1] = 1;

        for (int i = 2; i < n; i++) {
            fibCount[i] = fibCount[i-1] +fibCount[i-2];
        }

        bw.write(String.valueOf(fibCount[n-1]) + " " + String.valueOf(n-2) + '\n');
		bw.flush();
		bw.close();
		br.close();
	}
}