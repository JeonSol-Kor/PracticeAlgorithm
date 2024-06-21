import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        sc.close();
        System.out.println(B / 11 * 10);
    }
}