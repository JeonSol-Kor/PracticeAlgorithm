import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        br.close();
        int answer = 1;
        int[][] check = new int[N][2];
        
        check[0][0] = Integer.parseInt(st.nextToken());
        check[0][1] = 1;

        for (int i = 1; i < N; i++) {
            check[i][0] = Integer.parseInt(st.nextToken());
            check[i][1] = 1;
            for(int j = 0; j < i; j++) {
                if (check[i][0] > check[j][0]) {
                    check[i][1] = Math.max(check[i][1], check[j][1] + 1);
                    answer = Math.max(answer, check[i][1]);
                }
            }
        }
        System.out.println(answer);
    }
}