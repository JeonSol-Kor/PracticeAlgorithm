import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N % 5 == 0) {
            System.out.println((int) N / 5);
        } else if (N > 5 && N % 5 == 1) {
            System.out.println((int) N / 5 + 1);
        } else if (N > 16 && N % 5 == 2) {
            System.out.println((int) N / 5 + 2);
        } else if (N > 5 && N % 5 == 3) {
            System.out.println((int) N / 5 + 1);
        } else if (N > 5 && N % 5 == 4) {
            System.out.println((int) N / 5 + 2);
        } else if (N % 3 == 0) {
            System.out.println((int) N / 3);
        }else{
            System.out.println(-1);
        }
    }
}