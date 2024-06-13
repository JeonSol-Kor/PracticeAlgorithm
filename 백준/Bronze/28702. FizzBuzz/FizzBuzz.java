import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.next();
        }
        sc.close();
        int answer = 0;
        for (int i = 0; i < 3; i++) {
            if (!input[i].equals("FizzBuzz") && !input[i].equals("Fizz") && !input[i].equals("Buzz")) {
                answer = Integer.parseInt(input[i]) + 3 - i;
                break;
            }
        }
        if (answer % 3 == 0 && answer % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (answer % 3 == 0) {
            System.out.println("Fizz");
        } else if (answer % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(answer);
        }
    }
}