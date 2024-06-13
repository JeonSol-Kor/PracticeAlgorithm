import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String JOIOI = sc.next();
        sc.close();
        int JOIcount = 0;
        int IOIcount = 0;
        for (int i = 0; i < JOIOI.length() - 2; i++) {
            String check = String.valueOf(JOIOI.charAt(i)) + String.valueOf(JOIOI.charAt(i + 1))
                    + String.valueOf(JOIOI.charAt(i + 2));
            if (check.equals("JOI")) {
                JOIcount++;
            } else if (check.equals("IOI")) {
                IOIcount++;
            }
        }
        System.out.println(JOIcount);
        System.out.println(IOIcount);
    }
}