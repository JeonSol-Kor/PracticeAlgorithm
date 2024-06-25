import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        StringBuilder primeNums = new StringBuilder();
        M = M == 1 ? 2 : M;
        for (int i = M; i <= N; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt((double) i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                primeNums.append(i).append("\n");
            }
        }
        System.out.print(primeNums);
    }
}