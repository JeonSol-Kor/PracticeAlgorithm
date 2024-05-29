import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        System.out.println(combination(N, K));
    }

    static int combination(int N, int K){
        int combi = factorial(N) / ((factorial(N-K)) * factorial(K));
        return combi;
    }

    static int factorial(int number){
        int facto = 1;
        while(number > 0){
            facto *= number;
            number--;
        }
        return facto;
    }
}
