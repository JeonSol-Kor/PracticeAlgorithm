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
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        System.out.println(A * B / GCD(A, B));
    }
}
