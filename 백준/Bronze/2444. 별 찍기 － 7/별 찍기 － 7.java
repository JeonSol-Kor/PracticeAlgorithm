import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 1; i < 2 * N; i++) {
			if (i <= N) {
				for (int j = 0; j < N - i; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < i - N; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < (2 * N - i) * 2 - 1; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}