import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();

		sc.close();

		ArrayList<Integer> primeN = new ArrayList<>();

		if (N == 1) {
			System.out.println("-1");
		} else {
			if (M == 1 || M == 2) {
				primeN.add(2);
			}
			for (int i = M; i < N + 1; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						break;
					} else {
						if (j == i - 1) {
							primeN.add(i);
						}
					}
				}
			}
			if (primeN.size() == 0) {
				System.out.println("-1");
			} else {
				int sum = 0;
				for (Integer number : primeN) {
					sum += number;
				}
				System.out.println(sum);
				System.out.println(primeN.get(0));
			}
		}

	}
}