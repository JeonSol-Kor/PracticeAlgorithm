import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        String Hash = sc.next();
        sc.close();
        long M = 0;

        for(int i = 0; i < L; i++){
            M += (Hash.charAt(i) - 'a' + 1) * pow(31, i);
            M %= 1234567891;
        }
        System.out.println(M);
    }

    public static long pow(long base, long exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
                result %= 1234567891;
            }
            base *= base;
            base %= 1234567891;
            exponent /= 2;
        }
        return result;
    }
}
