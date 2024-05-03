import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N];

		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(sc.nextLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = basket[A - 1];
			basket[A - 1] = basket[B - 1];
			basket[B - 1] = C;
		}

		sc.close();

		String output = "";

		for (int i = 0; i < basket.length; i++) {
			output += basket[i] + " ";
		}

		System.out.println(output);
	}
}