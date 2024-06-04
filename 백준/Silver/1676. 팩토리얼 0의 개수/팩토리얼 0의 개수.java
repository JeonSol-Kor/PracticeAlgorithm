import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int output = 0;
        for (int i = 5; N / i >= 1; i *= 5) {
            output += N / i;
        }
        System.out.println(output);
    }
}