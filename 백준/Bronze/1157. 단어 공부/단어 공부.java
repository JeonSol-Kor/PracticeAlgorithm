import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();

		String Uinput = input.toUpperCase();
		int[] index = new int['Z' - 'A' + 1];

		for (int i = 0; i < index.length; i++) {
			index[i] = 0;
		}

		int max = 0;
		int outIndex = 0;
		int count = 0;

		for (int i = 0; i < Uinput.length(); i++) {
			index[Uinput.charAt(i) - 'A'] += 1;
		}

		for (int i = 0; i < index.length; i++) {
			if (index[i] > max) {
				max = index[i];
				outIndex = i;
			}
		}

		for (int i = 0; i < index.length; i++) {
			if (index[i] == max) {
				count++;
			}
		}

		if (count > 1) {
			System.out.println("?");
		} else {
			System.out.println((char) (outIndex + 'A'));
		}

	}
}