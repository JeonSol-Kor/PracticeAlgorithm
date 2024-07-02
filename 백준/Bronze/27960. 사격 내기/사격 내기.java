import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int result = 0;
        int score = 512;
        if (A != B) {
            while (score > 0) {
                if ((A >= score && B < score) || (A < score && B >= score))
                    result += score;
                A = A >= score ? A -= score : A;
                B = B >= score ? B -= score : B;
                score /= 2;
            }
        }
        System.out.println(result);
    }
}