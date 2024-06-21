import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        while (true) {
            int num = 0;
            int L = sc.nextInt();
            int P = sc.nextInt();
            int V = sc.nextInt();
            if (L == 0 && P == 0 && V == 0)
                break;
            if (V % P == 0) {
                num = V / P * L;
            } else if (V % P > L) {
                num = V / P * L + L;
            } else {
                num = V / P * L + V % P;
            }
            System.out.printf("Case %d: %d\n", caseNum, num);
            caseNum++;
        }
        sc.close();
    }
}