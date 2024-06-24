import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine().trim());
        }
        br.close();
        int count = 0;
        for (int i = N - 1; i > -1; i--) {
            int coin = coins[i];
            if(K >= coin){
                count += K / coin;
                K %= coin;
            }
            if(K == 0){
                break;
            }
        }
        System.out.println(count);
    }
}
