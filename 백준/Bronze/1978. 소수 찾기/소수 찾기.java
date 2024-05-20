import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N;

		for (int i = 0; i < N; i++) {
			int number = sc.nextInt();
			if (number == 1) {
				count--;
			} else {
				for (int j = 2; j < number; j++) {
					if (number % j == 0) {
						count--;
						break;
					}
				}
			}
		}
		System.out.println(count);

		sc.close();
	}
}