import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        sc.close();
        int range = N.length();
        int[] numbers = new int[range];
        for (int i = 0; i < range; i++) {
            numbers[i] = Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        Arrays.sort(numbers);
        for (int i = range - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }
}