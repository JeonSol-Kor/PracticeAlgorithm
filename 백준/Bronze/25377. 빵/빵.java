import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int output = 1001;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > B) continue;
            if (output > B) output = B;
        }
        sc.close();

        if (output == 1001) output = -1;

        System.out.println(output);
    }
}