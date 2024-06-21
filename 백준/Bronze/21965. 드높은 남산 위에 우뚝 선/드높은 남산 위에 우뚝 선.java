import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean increase = true;
        String output = "YES";
        int N = sc.nextInt();
        int check = 0;
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            if (check == A) {
                output = "NO";
                break;
            }
            if (increase) {
                if (check < A) {
                    check = A;
                } else {
                    increase = false;
                }
            } else {
                if (check > A) {
                    check = A;
                } else {
                    output = "NO";
                    break;
                }
            }
        }
        sc.close();
        System.out.println(output);
    }
}