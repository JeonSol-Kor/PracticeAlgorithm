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
        Scanner sc = new Scanner(System.in);
        long A1 = sc.nextLong();
        long B1 = sc.nextLong();
        long A2 = sc.nextLong();
        long B2 = sc.nextLong();
        sc.close();
        long son = A1 * B2 + B1 * A2;
        long mom = B1 * B2;
        long gcd = GCD(son, mom);
        System.out.println(son / gcd + " " + mom / gcd);
    }
}
