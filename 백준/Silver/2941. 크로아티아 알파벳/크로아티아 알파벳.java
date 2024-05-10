import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		int count = input.length();
		if (count == 1) {
		} else {
			String testInput = "";
			String testInput2 = "";
			String testInput3 = input.charAt(input.length() - 2) + "" + input.charAt(input.length() - 1);
			String testInput4 = "";
			if (input.length() > 2) {
				testInput4 = input.charAt(input.length() - 3) + "" + input.charAt(input.length() - 2) + ""
						+ input.charAt(input.length() - 1);
			}

			for (int i = 0; i < input.length() - 2; i++) {
				testInput = input.charAt(i) + "" + input.charAt(i + 1);
				testInput2 = input.charAt(i) + "" + input.charAt(i + 1) + "" + input.charAt(i + 2);
				if (testInput.equals("c=") || testInput.equals("c-") || testInput.equals("d-") ||
						testInput.equals("lj") || testInput.equals("nj") || testInput.equals("s=")
						|| testInput.equals("z=")) {
					i++;
					count--;
				} else if (testInput2.equals("dz=")) {
					i += 2;
					count -= 2;
				}
			}
			if (testInput4.equals("dz=")) {
			} else if (testInput3.equals("c=") || testInput3.equals("c-") || testInput3.equals("d-") ||
					testInput3.equals("lj") || testInput3.equals("nj") || testInput3.equals("s=")
					|| testInput3.equals("z=")) {
				count--;
			}
		}

		System.out.println(count);
	}
}