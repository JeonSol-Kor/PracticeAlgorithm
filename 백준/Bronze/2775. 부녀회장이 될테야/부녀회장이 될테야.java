import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            int[] people = new int[n];
            for (int j = 0; j < n; j++) {
                people[j] = j + 1;
            }
            for (int j = 1; j < k + 1; j++) {
                for (int l = 1; l < n; l++) {
                    people[l] += people[l - 1];
                }
            }
            System.out.println(people[n-1]);
        }
        sc.close();
    }
}