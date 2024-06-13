import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] trophys = new int[N];
        for (int i = 0; i < N; i++) {
            trophys[i] = sc.nextInt();
        }
        sc.close();

        int leftCount = 0;
        int rightCount = 0;
        int leftMax = 0;
        int rightMax = 0;

        for (int i = 0; i < N; i++) {
            if (trophys[i] > leftMax) {
                leftMax = trophys[i];
                leftCount++;
            }
            if (trophys[N - i - 1] > rightMax) {
                rightMax = trophys[N - i - 1];
                rightCount++;
            }
        }
        System.out.println(leftCount);
        System.out.println(rightCount);
    }
}