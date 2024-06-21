import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            String check = sc.next();
            if (check.contains("01")) {
                count++;
            } else if (check.contains("OI")) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}