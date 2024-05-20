import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 주어진 수 입력받기
		while (n != -1) {
			StringBuilder sb = new StringBuilder();
			int sum = 0;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					sb.append(i).append(" + ");
					sum += i;
				}
			}

			if (sum == n) {
				System.out.println(n + " = " + sb.toString().substring(0, sb.length() - 3));
			} else {
				System.out.println(n + " is NOT perfect.");
			}
			n = sc.nextInt();
		}

		sc.close();
	}
}