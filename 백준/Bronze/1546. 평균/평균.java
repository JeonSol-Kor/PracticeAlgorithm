import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		StringTokenizer st = new StringTokenizer(sc.nextLine());
		sc.close();

		int[] Scores = new int[N];
		int max = 0;
		float fixSum = 0;

		for (int i = 0; i < N; i++) {
			Scores[i] = Integer.parseInt(st.nextToken());
			if (Scores[i] > max) {
				max = Scores[i];
			}
		}

		for (int score : Scores) {
			fixSum += (float) score / (float) max * 100;
		}

		float fixAverage = fixSum / N;

		System.out.println(fixAverage);

	}
}