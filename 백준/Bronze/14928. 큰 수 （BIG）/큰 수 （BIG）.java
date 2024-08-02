import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        int divisor = 20000303;
        long remainder = 0;
        
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % divisor;
        }
        
        System.out.println(remainder);
    }
}
