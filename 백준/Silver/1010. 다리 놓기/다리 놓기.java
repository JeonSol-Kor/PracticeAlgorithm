import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            System.out.println(combination(M, N));
        }
        sc.close();
    }

    private static long combination(long n, long k) {
        if (k > n - k) {
            k = n - k;
        }
        long result = 1;
        for (long i = 0; i < k; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}