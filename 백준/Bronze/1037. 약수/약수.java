import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] divisors = new int[n];
        for (int i = 0; i < n; i++) {
            divisors[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(divisors);
        int result = divisors[0] * divisors[n - 1];
        System.out.println(result);
    }
}