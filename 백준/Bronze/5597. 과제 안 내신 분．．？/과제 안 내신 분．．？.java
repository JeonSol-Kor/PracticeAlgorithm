import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[30];

		for (int i = 0; i < 30; i++) {
			numbers[i] = i + 1;
		}

		String str = "";

		for (int i = 0; i < 28; i++) {
			int input = sc.nextInt();
			for (int number : numbers) {
				if (input == number) {
					numbers[number - 1] = 0;
				}
			}
		}

		for (int number : numbers) {
			if (number != 0) {
				str += number + " ";
			}
		}

		sc.close();

		String[] tokens = str.trim().split("\\s+");
		int A = Integer.parseInt(tokens[0]);
		int B = Integer.parseInt(tokens[1]);

		if (A > B) {
			System.out.println(B);
			System.out.println(A);
		} else {
			System.out.println(A);
			System.out.println(B);
		}

	}
}
