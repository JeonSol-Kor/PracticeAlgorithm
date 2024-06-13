import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] piles = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            piles[i] = sc.nextInt();
            sum += piles[i];
        }
        sc.close();

        int average = sum / N;
        int move = 0;
        for (int pile : piles) {
            if (pile > average)
                move += pile - average;
        }
        System.out.println(move);
    }
}