import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[][] matrix = new char[5][15];

		for (int i = 0; i < 5; i++) {
			String temp = br.readLine();
			for (int j = 0; j < temp.length(); j++) {
				matrix[i][j] = temp.charAt(j);
			}
		}

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (matrix[j][i] != '\0') { // 배열이 초기화되지 않은 경우를 고려
					bw.write(matrix[j][i]);
				}
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}