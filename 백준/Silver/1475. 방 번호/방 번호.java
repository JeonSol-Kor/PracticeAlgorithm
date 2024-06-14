import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int[] deci = new int[9];
        while (num > 0) {
            int deciNum = num % 10;
            if (deciNum == 9) {
                deciNum = 6;
            }
            deci[deciNum]++;
            num /= 10;
        }
        deci[6] = deci[6] % 2 == 0 ? deci[6] / 2 : deci[6] / 2 + 1;

        int max = 0;
        for (int check : deci) {
            if (max < check)
                max = check;
        }
        System.out.println(max);
    }
}