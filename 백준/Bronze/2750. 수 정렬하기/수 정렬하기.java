import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine().trim());
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(br.readLine().trim());
		}
		br.close();
		Arrays.sort(numbers);
		for (int i = 0; i < N; i++) {
			bw.write(numbers[i] + "\n");
		}
		bw.flush();
		bw.close();
	}
}