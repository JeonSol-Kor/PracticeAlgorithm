import java.io.*;
import java.util.*;

public class Main {
    private static long GCD(long A, long B) {
        long temp = 0;
        while (B > 0) {
            temp = A;
            A = B;
            B = temp % B;
        }
        return A;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] locations = new long[N];
        for (int i = 0; i < N; i++) {
            locations[i] = Long.parseLong(br.readLine());
        }
        br.close();
        if (N == 1) {
            System.out.println(0);
        } else {
            Arrays.sort(locations);
            long[] distances = new long[N - 1];
            for (int i = 0; i < N - 1; i++) {
                distances[i] = locations[i + 1] - locations[i];
            }
            long g = distances[0];
            for (int i = 1; i < N - 1; i++) {
                g = GCD(distances[i], g);
                if (g == 1) break;
            }
            int result = 0;
            for (long dist : distances) {
                result += dist / g - 1;
            }
            System.out.println(result);
        }
    }
}
