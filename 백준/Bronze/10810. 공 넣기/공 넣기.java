import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(sc.nextLine());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());
			int ball = Integer.parseInt(st.nextToken());

			for (int j = min - 1; j < max; j++) {
				basket[j] = ball;
			}
		}

		sc.close();

		String output = "";

		for (int i = 0; i < basket.length; i++) {
			output += basket[i] + " ";
		}

		System.out.println(output);
	}
}