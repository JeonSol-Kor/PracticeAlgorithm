import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[9][9];
		int max = 0;
		int maxR = 1;
		int maxC = 1;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = sc.nextInt();
				if (matrix[i][j] > max) {
					max = matrix[i][j];
					maxR = i + 1;
					maxC = j + 1;
				}
			}
		}
		sc.close();
		System.out.println(max);
		System.out.println(maxR + " " + maxC);

	}
}