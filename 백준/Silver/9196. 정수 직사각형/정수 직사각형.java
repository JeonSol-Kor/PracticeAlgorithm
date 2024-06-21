import java.io.*;
import java.util.*;

public class Main {
    private static String findRect(int h, int w) {
        int curDiagnoal = h * h + w * w;
        int minDiagonal = 151 * 151 * 2;
        int resultH = 0;
        int resultW = 0;
        for (int nh = 1; nh <= 150; nh++) {
            for (int nw = nh + 1; nw <= 150; nw++) {
                int newDiagonal = nh * nh + nw * nw;
                if (newDiagonal > curDiagnoal || (newDiagonal == curDiagnoal && nh > h)) {
                    if (newDiagonal < minDiagonal || (newDiagonal == minDiagonal && nh < resultH)) {
                        minDiagonal = newDiagonal;
                        resultH = nh;
                        resultW = nw;
                    }
                }
            }
        }
        String output = resultH + " " + resultW;
        return output;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (h == 0 && w == 0)
                break;
            System.out.println(findRect(h, w));
        }
        sc.close();
    }
}