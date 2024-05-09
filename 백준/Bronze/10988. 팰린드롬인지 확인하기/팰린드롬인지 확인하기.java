import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		String reverse = "";

		for (int i = 0; i < input.length(); i++) {
			reverse += input.charAt(input.length() - i - 1);
		}

		if (input.equals(reverse)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}