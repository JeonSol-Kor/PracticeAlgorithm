import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        String Hash = sc.next();
        sc.close();
        long M = 0;

        for(int i = 0; i < L; i++){
            M += (Hash.charAt(i) - 'a' + 1) * Math.pow(31, i);
            M %= 1234567891;
        }
        System.out.println(M);
    }
}