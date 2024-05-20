import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int n = 1;
		int sequence = 0;
		int denominator = 1;
		int numerator = 1;

		while (X > sequence) {
			sequence = n * (n + 1) / 2;
			n++;
		}

		if (n % 2 == 0) {
			denominator = n - (sequence - X) - 1;
			numerator = n - denominator;
		} else {
			numerator = n - (sequence - X) - 1;
			denominator = n - numerator;
		}
		System.out.println(numerator + "/" + denominator);
	}
}