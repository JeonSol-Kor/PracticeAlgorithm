import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        if (N == 1) {
            System.out.println(0);
        } else if (N == 2) {
            System.out.println(2);
        } else {
            System.out.println(N * (N - 1));
        }
    }
}