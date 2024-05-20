import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int count = 0;
		int aliquot = 1;

		while (count < K && aliquot <= N) {
			if (N % aliquot == 0) {
				count++;
			}
			aliquot++;
		}
		if (aliquot == N + 1) {
			if (count < K) {
				System.out.println("0");
			} else {
				System.out.println(aliquot - 1);
			}
		} else {
			System.out.println(aliquot - 1);
		}

		sc.close();
	}
}