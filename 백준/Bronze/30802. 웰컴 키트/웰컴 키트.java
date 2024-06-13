import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] size = new int[6];
        for (int i = 0; i < 6; i++) {
            size[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();
        sc.close();
        int muk = 0;
        for (int cloth : size) {
            if (cloth % T == 0) {
                muk += cloth / T;
            } else {
                muk += cloth / T + 1;
            }
        }

        int penMuk = N / P;
        int penxEx = N % P;
        System.out.println(muk);
        System.out.println(penMuk + " " + penxEx);
    }
}