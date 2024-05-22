import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] cards = new int[N];
		int output = 0;
		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int cardsSum = cards[i] + cards[j] + cards[k];
					if (cardsSum <= M && cardsSum > output)
						output = cardsSum;
				}
			}
		}
		System.out.println(output);
	}
}