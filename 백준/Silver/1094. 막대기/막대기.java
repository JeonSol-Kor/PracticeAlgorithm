import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int sum = 0;
        while (num > 0) {
            sum += num % 2;
            num /= 2;
        }
        System.out.println(sum);
    }
}