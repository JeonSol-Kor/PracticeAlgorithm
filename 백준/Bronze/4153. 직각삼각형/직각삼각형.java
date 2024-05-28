import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] sides = new int[3];
        while (true) {
            sides[0] = sc.nextInt();
            sides[1] = sc.nextInt();
            sides[2] = sc.nextInt();
            if (sides[0] == 0 || sides[1] == 0 || sides[2] == 0) {
                break;
            } else {
                Arrays.sort(sides);
                if (sides[2] * sides[2] == sides[1] * sides[1] + sides[0] * sides[0]) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
        sc.close();

    }
}