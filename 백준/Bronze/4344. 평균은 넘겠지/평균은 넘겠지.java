import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {
            int num = sc.nextInt();
            int[] scores = new int[num];

            int sum = 0;
            for (int j = 0; j < num; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            double average = (double) sum / num;
            int count = 0;

            for (int j = 0; j < num; j++) {
                if (scores[j] > average) count++;
            }

            double rate = ((double) count / num) * 100;
            System.out.printf("%.3f%%\n", rate);
        }

        sc.close();
    }
}