import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();
        int sum = A + B + C + D;
        int min = sum / 60;
        int sec = sum % 60;
        System.out.println(min);
        System.out.println(sec);
    }
}