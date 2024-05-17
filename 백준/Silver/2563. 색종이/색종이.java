import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[][] paper = new int[100][100];

		int N = Integer.parseInt(br.readLine());
		for (int k = 0; k < N; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			for (int i = x; i < x + 10; i++) {
				for (int j = y; j < y + 10; j++) {
					paper[i][j] = 1;
				}
			}
		}

		int area = 0;

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				area += paper[i][j];
			}
		}

		bw.write(String.valueOf(area) + "\n");

		br.close();
		bw.flush();
		bw.close();
	}
}