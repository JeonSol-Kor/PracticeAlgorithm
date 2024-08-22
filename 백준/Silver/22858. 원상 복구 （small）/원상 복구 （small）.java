import java.io.*;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
        
        int[] S = new int[N];
        int[] D = new int[N];
        int[] P = new int[N];
        
        st = new StringTokenizer(br.readLine().trim());
        for(int i = 0; i < N; i++){
            S[i] = Integer.parseInt(st.nextToken());
            P[i] = S[i];
        }

        st = new StringTokenizer(br.readLine().trim());
        for(int i = 0; i < N; i++){
            D[i] = Integer.parseInt(st.nextToken());
        }

        for(int k = 0; k < K; k++){
            int[] temp = new int[N];
            for(int i = 0; i < N; i++){
                temp[D[i] - 1] = P[i];
            }
            P = temp;
        }

        for(int i = 0; i < N; i++){
            bw.write(String.valueOf(P[i]) + ' ');
        }
        
        bw.write('\n');
		bw.flush();
		bw.close();
		br.close();
	}
}