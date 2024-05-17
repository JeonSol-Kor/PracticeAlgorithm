import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		sc.close();
		double output = 0;

		for (int i = 0; i < N.length(); i++) {
			int ascii = N.charAt(i);
			if (ascii > 64 && ascii < 91) {
				output += (ascii - 55) * Math.pow(B, (N.length() - i - 1));
			} else {
				output += Character.getNumericValue(N.charAt(i)) * Math.pow(B, (N.length() - i - 1));
			}
		}

		long number = (long) output;
		System.out.println(number);
	}
}