import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();
        sc.close();
        long result = 1;
        for(int i = 1; i <= N; i++){
            result = (result * i) % P;
        }
        System.out.println(result);
    }
}