import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine().trim());

        long[] tri = new long[100];
        tri[0] = 1;
        tri[1] = 1;
        tri[2] = 1;
        tri[3] = 2;
        tri[4] = 2;
        for(int i = 5; i < 100; i++){
            tri[i] = tri[i-1] + tri[i-5];
        }
        
        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine().trim());
            result.append(tri[N-1]).append('\n');
        }

        bw.write(result.toString());
		bw.flush();
		bw.close();
		br.close();
	}
}