import java.io.*;
import java.util.*;

public class Main {
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] papers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                papers[i][j] = sc.nextInt();
            }
        }
        sc.close();

        countColorPaper(papers, 0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    static void countColorPaper(int[][] papers, int row, int col, int n) {
        if (checkColor(papers, row, col, n)) {
            if (papers[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }
        n /= 2;
        countColorPaper(papers, row, col, n);
        countColorPaper(papers, row, col + n, n);
        countColorPaper(papers, row + n, col, n);
        countColorPaper(papers, row + n, col + n, n);
    }

    static boolean checkColor(int[][] papers, int row, int col, int n) {
        int color = papers[row][col];
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (papers[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }
}