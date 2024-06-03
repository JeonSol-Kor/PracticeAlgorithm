import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		String[][] Board = new String[N][M];
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < M; j++) {
				Board[i][j] = String.valueOf(line.charAt(j));
			}
		}
		sc.close();
		int minRepaints = Integer.MAX_VALUE;
		for (int i = 0; i < N - 7; i++) {
			for (int j = 0; j < M - 7; j++) {
				int wStart = 0;
				int bStart = 0;
				for (int r = i; r < i + 8; r++) {
					for (int c = j; c < j + 8; c++) {
						if ((r + c) % 2 == 0) {
							if (!Board[r][c].equals("W"))
								wStart++;
							if (!Board[r][c].equals("B"))
								bStart++;
						} else {
							if (!Board[r][c].equals("B"))
								wStart++;
							if (!Board[r][c].equals("W"))
								bStart++;
						}
					}
				}
				int currentMin = Math.min(wStart, bStart);
				if (currentMin < minRepaints)
					minRepaints = currentMin;
			}
		}
		System.out.println(minRepaints);
	}
}