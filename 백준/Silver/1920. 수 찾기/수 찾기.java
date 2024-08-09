import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine().trim());
        String[] strA = br.readLine().split(" ");
        
        HashSet<Integer> A = new HashSet<>();
        for(int i = 0; i < N; i++){
            A.add(Integer.parseInt(strA[i]));
        }
        
        int M = Integer.parseInt(br.readLine().trim());
        String[] strB = br.readLine().split(" ");
        br.close();

        int[] B = new int[M];
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(strB[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            if(A.contains(B[i])) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}