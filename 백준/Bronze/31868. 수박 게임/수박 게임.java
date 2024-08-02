import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        sc.close();
        long result = K;
        for(int i = 0; i < N - 1; i++){
            result /= 2;
        }

        System.out.println(result);
    }
}