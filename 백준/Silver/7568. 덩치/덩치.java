import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dungChis = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dungChis[i][0] = Integer.parseInt(st.nextToken());
            dungChis[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 0; j < N; j++) {
                if (dungChis[i][0] < dungChis[j][0] && dungChis[i][1] < dungChis[j][1])
                    count++;
            }
            answer.append(count).append(" ");
        }
        System.out.println(answer.toString());
    }
}