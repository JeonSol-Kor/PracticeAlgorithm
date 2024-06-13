import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> numsN = new HashSet<>(N);
        for (int i = 0; i < N; i++) {
            numsN.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(br.readLine().trim());
        st = new StringTokenizer(br.readLine());
        br.close();
        int[] numsM = new int[M];
        for (int i = 0; i < M; i++) {
            numsM[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (numsN.contains(numsM[i])) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        
        bw.write(sb.toString().trim() + "\n");
        bw.flush();
        bw.close();
    }
}