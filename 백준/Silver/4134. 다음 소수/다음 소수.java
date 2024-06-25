import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            long prime = 2;
            if (n > 1) {
                for (long j = n; j < 2 * n + 1; j++) {
                    boolean check = true;
                    for (long k = 2; k <= Math.sqrt((long) j); k++) {
                        if (j % k == 0) {
                            check = false;
                            break;
                        }
                    }
                    if (check) {
                        prime = j;
                        break;
                    }
                }
            }
            System.out.println(prime);
        }
        sc.close();
    }
}