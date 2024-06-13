import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        sc.close();
        System.out.println(Integer.parseInt(A) + Integer.parseInt(B) - Integer.parseInt(C));
        System.out.println(Integer.parseInt(A + B) - Integer.parseInt(C));
    }
}