import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		StringBuilder result = new StringBuilder();

		while (N > 0) {
			int remainder = N % B;
			if (remainder < 10) {
				result.insert(0, remainder);
			} else {
				result.insert(0, (char) (remainder + 55));
			}
			N /= B;
		}

		System.out.println(result);
	}
}