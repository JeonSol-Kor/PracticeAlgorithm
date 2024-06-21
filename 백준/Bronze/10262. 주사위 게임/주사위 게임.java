import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int Gunnar = 0;
        int Emma = 0;
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            Gunnar += num;
        }
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            Emma += num;
        }
        sc.close();
        if (Gunnar == Emma) {
            System.out.println("Tie");
        } else if (Gunnar > Emma) {
            System.out.println("Gunnar");
        } else {
            System.out.println("Emma");
        }
    }
}