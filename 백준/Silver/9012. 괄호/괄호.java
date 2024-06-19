import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            int leftCount = 0, rightCount = 0;
            boolean stop = false;
            String words = sc.nextLine();
            for (int j = 0; j < words.length(); j++) {
                char word = words.charAt(j);
                if (leftCount < rightCount) {
                    stop = true;
                    break;
                } else if (word == '(') {
                    leftCount++;
                } else if (word == ')') {
                    rightCount++;
                }
            }
            if (stop || leftCount != rightCount) {
                System.out.println("NO");
            } else if (leftCount == rightCount) {
                System.out.println("YES");
            }
        }
        sc.close();
    }
}