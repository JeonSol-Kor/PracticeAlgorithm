import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (N == 0) {
            System.out.println(1);
        } else {
            long output = 1;
            for (int i = 1; i <= N; i++) {
                output *= i;
            }
            System.out.println(output);
        }

    }
}