import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numbers = new int[9];
		int max = 0;
		int N = 0;

		for (int i = 0; i < 9; i++) {
			numbers[i] = Integer.parseInt(sc.nextLine());
		}

		sc.close();

		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}

		for (int i = 0; i < 9; i++) {
			if (numbers[i] == max) {
				N = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(N);
	}
}