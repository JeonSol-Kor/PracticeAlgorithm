import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());

		StringTokenizer st = new StringTokenizer(sc.nextLine());

		sc.close();

		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}

		int max = numbers[0];
		int min = numbers[0];

		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}

		String output = min + " " + max;

		System.out.println(output);
	}
}