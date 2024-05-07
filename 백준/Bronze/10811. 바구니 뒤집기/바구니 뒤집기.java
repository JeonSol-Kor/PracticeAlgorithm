import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		StringTokenizer st = new StringTokenizer(sc.nextLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N];
		int[] temp;

		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}

		for (int k = 0; k < M; k++) {
			st = new StringTokenizer(sc.nextLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());

			temp = basket.clone();

			for (int l = i - 1; l < j; l++) {
				basket[l] = temp[j - 1 - (l - i + 1)];
			}

			temp = basket.clone();
		}

		sc.close();

		for (int number : basket) {
			System.out.print(number + " ");
		}

	}
}