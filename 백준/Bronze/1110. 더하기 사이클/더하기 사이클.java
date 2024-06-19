import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int number = N;
        int count = 0;

        do {
            int tens = number / 10;
            int ones = number % 10;
            int sum = tens + ones;
            number = (ones * 10) + (sum % 10);
            count++;
        } while (number != N);

        System.out.println(count);
    }
}