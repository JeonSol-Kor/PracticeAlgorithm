import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}

		sc.close();

		if (X == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}