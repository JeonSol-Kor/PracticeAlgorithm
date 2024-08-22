import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		long H = Long.parseLong(st.nextToken()), x = Long.parseLong(st.nextToken());
        long mod = 1000000007;

        long result = 0;
        long power = 1;

        for (long i = 0; i < H; i++){
            long c = Long.parseLong(br.readLine().trim());
            power = (power * x) % mod;
            result = (result + c * power) % mod;
        }

        bw.write(result + "\n");

		bw.flush();
		bw.close();
		br.close();
	}
}