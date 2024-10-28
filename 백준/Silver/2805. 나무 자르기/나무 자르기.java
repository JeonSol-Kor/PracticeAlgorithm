import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        long[] trees = new long[N];
        st = new StringTokenizer(br.readLine().trim());
        long maxHeight = 0;

        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            if (trees[i] > maxHeight) {
                maxHeight = trees[i];
            }
        }

        long left = 0;
        long right = maxHeight;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;

            for (int i = 0; i < N; i++) {
                if (trees[i] > mid) {
                    total += trees[i] - mid;
                    if (total >= M) break;
                }
            }

            if (total >= M) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);

        br.close();
    }
}